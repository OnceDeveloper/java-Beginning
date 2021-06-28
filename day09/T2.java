import java.util.*;

class T2 
{
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	TreeSet<Integer> keys = new TreeSet<Integer>();
	void in(){
		ht.put(10, "��");
		ht.put(20, "����");
		ht.put(30, "����");
		ht.put(21, "�ʰܿ�");
		ht.put(40, "�ܿ�");
	}
	void out(){
		Enumeration<Integer> e = ht.keys();
		while(e.hasMoreElements()){
			Integer key = e.nextElement();
			keys.add(key);
		}
	}
	void show1(){ //(1) �������� ���
        for(Integer key : keys){
			System.out.println("key: " + key  + ", value: " + ht.get(key));
		}
	}
	void show2(){ //(2) �������� ���
		Iterator<Integer> iter = keys.descendingIterator();
		while(iter.hasNext()){
			Integer key = iter.next();
			System.out.println("key: " + key  + ", value: " + ht.get(key));
		}
	}
	public static void main(String[] args) 
	{
		T2 t = new T2();
		t.in();
		t.out();
		//t.show1();
		t.show2();
	}
}
