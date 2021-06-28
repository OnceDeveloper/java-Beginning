import java.util.*;

class B2{

	TreeSet<String> set2 = new TreeSet<String>();

	void in(){
		set2.add("봄");
		set2.add("여름");
		set2.add("여름");
		set2.add("가을");
		set2.add("10");
	}

	void out(){
		String item = "";
		Iterator<String> iter = set2.iterator();
		//Iterator iter = set2.descendingIterator();
		while(iter.hasNext()){
			item = iter.next();
			System.out.println(item);
		}
	}

	public static void main(String[] args) 
	{
		B2 b = new B2();
		b.in();
		b.out();
	}
}
