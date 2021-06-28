import java.util.*;

//Generic 적용 
class CC 
{
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	void in(){
		ht.put(new Integer(10), "봄");
		ht.put(new Integer(20), "여름");
		ht.put(new Integer(30), "가을");
		ht.put(new Integer(40), "겨울");
	}
	void out(){
		Enumeration<Integer> e = ht.keys();
		while(e.hasMoreElements()){
			Integer key = e.nextElement();
			String val = ht.get(key);
			System.out.println("key: "+ key + ", val: " + val);
		}
	}
	public static void main(String[] args) 
	{
		CC c = new CC();
		c.in();
		c.out();
	}
}
