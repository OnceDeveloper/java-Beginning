import java.util.*;

class B 
{
	TreeSet set=new TreeSet();
    void in(){
		set.add("º½");
		set.add("catch");
		set.add("°¡À»");
		set.add("cat");
		set.add("cast");
		set.add("age");
		set.add("30");
		set.add("10");
		//set.add("!");
		//set.add("?");
		//set.add("#");
	}
	void out(){
		String item = "";
		//Iterator iter = set.iterator();
		Iterator iter = set.descendingIterator();
		while(iter.hasNext()){
			item = (String)iter.next();
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.in();
		b.out();
	}
}
