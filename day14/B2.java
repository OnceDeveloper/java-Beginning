class B2{
	int i = 10;
	void m1(){
		System.out.println("�ܺ�Ŭ���� B2�� m1()");
	}
	static int j = 20;
	static void m2(){
		System.out.println("�ܺ�Ŭ���� B2�� m1()");
	}
	class BBBB{
		int k = 30;
		void m3(){
			System.out.println("�ܺ�Ŭ���� �ڿ� ���� i" +i);
			System.out.println("�ܺ�Ŭ���� �ڿ� ���� static j" +j);
			m2();//�ܺ�Ŭ������ static �޼��� ����

			System.out.println("����Ŭ���� BBBB�� m3()");
		}
	}

	static class BBBB1{
		static int a = 40;
		void m4(){
			//System.out.pritnln("�ܺ�Ŭ���� �ڿ� ���� i" +i);
			System.out.println("�ܺ�Ŭ���� �ڿ� ���� static j" +j);
			m2();//�ܺ�Ŭ������ static �޼��� ����

			System.out.println("����Ŭ���� BBBB1�� m4()");
		}
		public static void main(String[] args) 
		{
			/*BBBB1 b = new BBBB1();
			System.out.println(a);
			b.m4();*/
			
			/*B2.BBBB b = new B2().new BBBB();
			b.m3();*///BBBB��ü ������

			new B2().new BBBB().m3();

		}
	}
}
