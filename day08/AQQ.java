import java.util.*;

class AQQ 
{
	ArrayList<String> list = new ArrayList<String>(); //��� Ÿ���� ���� 
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

	void in3(){
		for(int i=0; i<strs.length; i++){
			list.add(strs[i]);
		}
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
		AQQ a = new AQQ();
		//a.in();
		//a.in2();
		a.in3();
		a.out();
	}
}
