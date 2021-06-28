import java.util.*;

class A2{
	ArrayList<Object> list = new ArrayList<Object>();

	void in(){
		list.add("봄");
		list.add("여름");
		list.add("초여름");
		list.add("가을");
		list.add("겨울");
		
	}
	
	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println("list ["+i+"] : "+str);
		}
	}


	public static void main(String[] args) 
	{
		A2 a = new A2();
		a.in();
		a.out();
	}
}
