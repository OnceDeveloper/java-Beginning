import java.util.*;

class A2{
	ArrayList<Object> list = new ArrayList<Object>();

	void in(){
		list.add("��");
		list.add("����");
		list.add("�ʿ���");
		list.add("����");
		list.add("�ܿ�");
		
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
