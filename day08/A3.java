import java.util.*;

class A3 {

	ArrayList li = new ArrayList();

	void in(){
		li.add("º½");
		li.add("¾È³ç");
		li.add("Èþ");
		li.add("Çë");
	}

	void out(){
		int size = li.size();
		for(int i=0; i<size; i++){
			Object obj = li.get(i);
			String str = (String)obj;
			System.out.println("li["+i+"] : "+str);
		}
	}

	public static void main(String[] args) 
	{
		A3 a = new A3();
		a.in();
		a.out();
	}
}
