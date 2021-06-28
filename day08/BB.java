import java.util.*;

//Generic 적용 
class BB 
{
	TreeSet<String> set=new TreeSet<String>();
    void in(){
		set.add("봄");
		set.add("여름");
		set.add("가을");
		set.add("겨울");
	}
	void out(){
		String item = "";
		Iterator<String> iter = set.iterator();
		//Iterator iter = set.descendingIterator();
		while(iter.hasNext()){
			item = iter.next();
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		BB b = new BB();
		b.in();
		b.out();
	}
}
