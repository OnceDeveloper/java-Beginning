abstract class D2{
	int i;
	void m1(){
		System.out.println("m1");
	}
	abstract void m2();
}

class DChild2 extends D2{
	void m2(){
		i=2;
	}
}

class DUser2{
	public static void main(String[] args) 
	{
		D2 d = new DChild2();
		d.m2();//�������̵��Ǿ i = 0 ���� 2�� �ٲ�
		System.out.println(d.i);//2�ιٲ� i�� ��µ�
	}
}
