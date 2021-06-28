import java.util.*;

class BB1 {

	TreeSet<String> tst = new TreeSet<String>();

	void in(){
		tst.add("봄");
		tst.add("여름");
		tst.add("가을");
		tst.add("겨울");
	}

	void out(){
		String item = "";
		Iterator<String> iter = tst.iterator();
		while(iter.hasNext()){
			item = iter.next();
			System.out.println(item);
		}
	}

	public static void main(String[] args) 
	{
		BB1 b = new BB1();
		b.in();
		b.out();
	}
}
