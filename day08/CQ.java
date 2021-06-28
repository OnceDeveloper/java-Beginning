import java.util.*;

class CQ 
{
	ArrayList listKey = new ArrayList(); 
	Vector v = new Vector();
	Hashtable ht = new Hashtable();
	void in(){
		listKey.add("가");
		listKey.add("가가");
		v.add("ab");
		v.add("cat");
		ht.put(listKey, v);
		ht.put("나", "여름");
		ht.put("마", "가을");
		ht.put("다", "여름");
		ht.put("라", "겨울");
	}
	void out(){
		Enumeration e = ht.keys();
		while(e.hasMoreElements()){
			Object key = e.nextElement();
			//String key = (String)keyObj;
			Object val = ht.get(key);
			//String val = (String)valObj;
			System.out.println("key: "+ key + ", val: " + val);
		}
	}
	public static void main(String[] args) 
	{
		CQ c = new CQ();
		c.in();
		c.out();
	}
}
