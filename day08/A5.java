import java.util.*;

class A5 {

	Vector<Object> lists = new Vector<Object>();
	
	void in(){
		lists.add("��");
		lists.add("��");
		lists.add("��");
		lists.add("��");
		lists.add("��");
	}

	void out(){
		int size = lists.size();
		for(int i=0; i<size; i++){
			Object obj = lists.get(i);
			String str = (String)obj;
			System.out.println("list["+i+"] : "+str);
		}
	}

	public static void main(String[] args) 
	{
		A5 a = new A5();
		a.in();
		a.out();
	}
}
