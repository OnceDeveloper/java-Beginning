import java.util.*;

//Generic ���� + Boxing
class CCC 
{
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	void in(){
		ht.put(new Integer(10), "��");
		ht.put(20, "����"); //AutoBoxing ( int -> Integer )
		ht.put(30, "����");
		ht.put(40, "�ܿ�");
	}
	void out(){
		Enumeration<Integer> e = ht.keys();
		while(e.hasMoreElements()){
			//Integer key = e.nextElement();
			//String val = ht.get(key);

			int key = e.nextElement();
			String val = ht.get(key);
			System.out.println("key: "+ key + ", val: " + val);
		}
	}
	public static void main(String[] args) 
	{
		CCC c = new CCC();
		c.in();
		c.out();
	}
}
