import java.util.*;

//Generic ���� 
class AA 
{
	ArrayList<String> list = new ArrayList<String>(); //��� Ÿ���� ���� 

    void in(){
		list.add("��"); 
		list.add("����");
		list.add("����");
		list.add("�ܿ�");
	}
	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			String str = list.get(i);
			System.out.println(str);
		}
	}
	public static void main(String[] args) 
	{
		AA a = new AA();
		a.in();
		a.out();
	}
}

