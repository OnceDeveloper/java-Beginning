import java.util.*;

class C 
{
	Hashtable ht = new Hashtable();
	void in(){
		ht.put(new Integer(10), "��");
		ht.put(new Integer(20), "����");
		ht.put(new Integer(30), "����");
		ht.put(new Integer(21), "����");
		ht.put(new Integer(40), "�ܿ�");
	}
	void out(){
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			Object keyObj = e.nextElement();
			Integer key = (Integer)keyObj;
			Object valObj = ht.get(key);
			String val = (String)valObj;
			System.out.println("key: "+ key + ", val: " + val);
		}
	}
	public static void main(String[] args) 
	{
		C c = new C();
		c.in();
		c.out();
	}
}
