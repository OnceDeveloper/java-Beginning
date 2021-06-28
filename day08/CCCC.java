import java.util.*;

//Generic 적용 + Boxing + Enhanced Loop
class CCCC 
{
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	void in(){
		ht.put(new Integer(10), "봄");
		ht.put(20, "여름"); //AutoBoxing ( int -> Integer )
		ht.put(30, "가을");
		ht.put(40, "겨울");
	}
	void out(){
		Set<Integer> set = ht.keySet();
		for(int key : set){ //UnBoxing( Integer -> int )
			System.out.println("key: "+ key + ", val: " + ht.get(key));
		}
	}
	public static void main(String[] args) 
	{
		CCCC c = new CCCC();
		c.in();
		c.out();
	}
}

