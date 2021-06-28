interface C1{
	void m1();
}
interface C2{
	void m2();
}
interface C3 extends C1,C2{
	void m3();
}


class C extends Object implements C3{

	public void m1(){
		System.out.println("m1()");
	}

	public void m2(){
		System.out.println("m2()");
	}
	public void m3(){
		System.out.println("m3()");
	}

	public static void main(String[] args) 
	{
		C c = new C();
		C3 c3 = c;
		C1 c1 = c3;
		C2 c2 = c3;

		c.m1(); c.m2(); c.m3();//c�� ȣ���ϸ� m1, m2, m3�� ���� C�� ��ü�̱⶧����
		System.out.println();
		c3.m1(); c3.m2(); c3.m3();//c3���� ȣ���ϸ� m1, m2, m3 �� ���� C�� �θ��̸鼭 C�� ���� �޼ҵ常 ���� �����ϱ�
		System.out.println();
		c1.m1();//c1���� ȣ���ϸ� C1�� �ִ� m1�� ȣ�Ⱑ��
		c2.m2();//c2���� ȣ���ϸ� C2�� �ִ� m2�� ȣ�Ⱑ��

		
		
		
		
	}
}
