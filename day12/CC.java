interface C1{
	void m1();
}
interface C2{
	void m2();
}
interface C3 {
	void m3();
}

class CC extends Object implements C1,C2,C3{

	public void m1(){
		System.out.println("m1");
	}
	public void m2(){
		System.out.println("m2");
	}
	public void m3(){
		System.out.println("m3");
	}

	public static void main(String[] args) 
	{
			CC c = new CC();
			C1 c1 = c;
			C2 c2 = c;
			C3 c3 = c;
			c.m1(); c.m2(); c.m3();//CC�� ��ü�ϱ� ���� ��� ����
			c1.m1();//CC���� C1�� ����ȯ(�ڽ�->�θ�)�� �� �Ŵϱ� m1�� ��밡��
			c2.m2();//CC���� C2�� ����ȯ(�ڽ�->�θ�)�� �� �Ŵϱ� m2�� ��밡��
			c3.m3();//CC���� C3�� ����ȯ(�ڽ�->�θ�)�� �� �Ŵϱ� m3�� ��밡��
	}
}
