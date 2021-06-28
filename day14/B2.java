class B2{
	int i = 10;
	void m1(){
		System.out.println("외부클래스 B2의 m1()");
	}
	static int j = 20;
	static void m2(){
		System.out.println("외부클래스 B2의 m1()");
	}
	class BBBB{
		int k = 30;
		void m3(){
			System.out.println("외부클래스 자원 접근 i" +i);
			System.out.println("외부클래스 자원 접근 static j" +j);
			m2();//외부클래스의 static 메서드 접근

			System.out.println("내부클래스 BBBB의 m3()");
		}
	}

	static class BBBB1{
		static int a = 40;
		void m4(){
			//System.out.pritnln("외부클래스 자원 접근 i" +i);
			System.out.println("외부클래스 자원 접근 static j" +j);
			m2();//외부클래스의 static 메서드 접근

			System.out.println("내부클래스 BBBB1의 m4()");
		}
		public static void main(String[] args) 
		{
			/*BBBB1 b = new BBBB1();
			System.out.println(a);
			b.m4();*/
			
			/*B2.BBBB b = new B2().new BBBB();
			b.m3();*///BBBB객체 생성함

			new B2().new BBBB().m3();

		}
	}
}
