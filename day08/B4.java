import java.util.*;

class B4 {

	TreeSet<Object> ts = new TreeSet<Object>();

	void in(){
		ts.add("��");
		ts.add("��");
		ts.add("��");
		ts.add("��");
		ts.add("��");
	}

	void out(){
		String t = "";
		//Iterator<Object> iter = ts.descendingIterator();
		Iterator<Object> iter = ts.iterator();
		while(iter.hasNext()){
			t = (String)iter.next();
			System.out.println(t);
		}
	}

	public static void main(String[] args) 
	{
		B4 b = new B4();
		b.in();
		b.out();
	}
}
