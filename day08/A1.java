import java.util.*;

class A1
{
	ArrayList<object> list = new ArrayList<object>();

	void in(){
		list.add("봄");
		//list.add(10);
		list.add("여름");
		list.add("가을");
		list.add("겨울");
	}
	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println(str);
		}
	}

	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.in();
		a.out();
	}
}
