import java.util.*;

class B1{
	
	TreeSet set1 = new TreeSet();
	

	void in(){
		set1.add("��");
		set1.add("����");
		set1.add("����");
		set1.add("����");
		set1.add("10");
	}

	void out(){
		String item = "";//���������ϱ� �ʱ�ȭ�� ����
		Iterator iter = set1.descendingIterator();//set1�� �ִ� ���� �����������ش�.
		while(iter.hasNext()){//set�� ��Ұ� ������ ������ �ݺ�
			item = (String)iter.next();//item�� iter�� ���� �־��ش�
			System.out.println("item: " +item);
		}
	}

	public static void main(String[] args) 
	{
		B1 b = new B1();
		b.in();
		b.out();
	}
}
