import aa.bb.B1;

class BChild1 implements B1{
	public void m1(){
		System.out.println("�������̵��� B1�� �޼ҵ�");
	}
}

class BUser1{
	void use(){
		System.out.println(B1.i);//B.i�� public�̸� static�̸� final�� ��!
		B1.m2();//m2()�� public static�� ��!
		//static�� ������ Ŭ���� ������ �ȴ�.
		//���� static�� ������ ��ü�� �����ؼ� �� ���� �ִµ� �������̽����� ��ü�� �����Ͽ� �� ��������.
		
		B1 b = new BChild1();
		b.m1();
		b.m3();

	}
	
	public static void main(String[] args) 
	{
		BUser1 b = new BUser1();
		b.use();
	}
}