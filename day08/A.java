import java.util.*;

class A 
{
	ArrayList list = new ArrayList(); //��� Ÿ���� ���� 
	String strs[] = {"��", "�ʰ���", "����", "����", "�ܿ�"};

    void in(){
		list.add("��"); //String -> Object 
		//Integer iObj = 10; //Auto Boxing 
		//list.add(10); //int -> Integer -> Object
		list.add("�ʰ���"); 
		list.add("����");
		list.add("����");
		list.add("�ܿ�");
	}
	void in2(){
		for(String str: strs) list.add(str);
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
		A a = new A();
		//a.in();
		a.in2();
		a.out();
	}
}
