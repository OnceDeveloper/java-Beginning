import java.util.*;

class A3 {

	ArrayList li = new ArrayList();

	void in(){
		li.add("��");
		li.add("�ȳ�");
		li.add("��");
		li.add("��");
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
