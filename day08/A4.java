import java.util.*;

class A4 {
	
	ArrayList<Object> lis = new ArrayList<Object>();//���׸��� ����Ͽ� Note �޽��� �� ������ ��.
	
	void in(){
		lis.add("�ȳ�");
		lis.add("�ϼ���");
		lis.add("�����");
		lis.add("��");
		lis.add("!");
	}

	void out(){
		int size = lis.size();
		for(int i=0; i<size; i++){
			Object obj = lis.get(i);//obj��� ������ ������ lis�� �ִ� i��° ���� �ִ´�.ex)lis.get(0) = "�ȳ�"
			String str = (String)obj;//lis�� String���� �־����ϱ� Object�� �� lis�� �� ������ String���� �����ֱ� ���� obj�� ��������ȯ����
			System.out.println("lis["+i+"] : "+str);
		}
	}

	public static void main(String[] args) 
	{
		A4 a = new A4();
		a.in();
		a.out();
	}
}
