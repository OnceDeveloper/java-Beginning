import java.util.*;

class B3{

	TreeSet<Object> tree = new TreeSet<Object>();
	
	void in(){

		tree.add("¾È³ç");
		tree.add("ÇÏ¼¼¿ä");
	}

	void out(){
		Iterator<Object> iter = tree.iterator();
		for(String item="";iter.hasNext();){
			item = (String)iter.next();
			System.out.println(item);
		}
	}

	public static void main(String[] args) 
	{
		B3 b = new B3();
		b.in();
		b.out();
	}
}
