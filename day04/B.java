class B 
{
	int i = 10 ; //��ü�ҼӺ���
	static int j = 20; //Ŭ�����ҼӺ���

	/*void m(){ �Ұ�!!
		static int k =30;
	}*/ 
}
class BMgr
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		B b2 = new B();

		System.out.println("i: " + b1.i);
		System.out.println("j1: " + B.j);

        //���� 
		System.out.println("j2: " + b1.j);
		System.out.println("j3: " + b2.j);
	}
}
