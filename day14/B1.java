class B1{//Outter
	private int i = 10;
	private static int ii = 11;//static
	private void m1(){
		System.out.println("B1의 m1()");
	}
	private static void m11(){
		System.out.println("B1의 m11()");
	}

	class BBB1{
		int j = 20;
		void m2(){
			System.out.println("i : " +i);//B1의 것을 자기 것처럼 쓸 수 있다.
			m1();
			System.out.println("static ii : "+ii);
			System.out.println("BBB1의 m()");
		}
	}
	static class BBB2{//static 클래스에서는 static 자원만 접근 가능하다./main문 때문에 static 클래스가 되어야 한다.
		int k =30;
		void m3(){
			//System.out.println("i : " +i);
			System.out.println("ii : "+ii);
			m11();

			System.out.println("BBB2의 m()");
		}
		public static void main(String args[]){
			//BBB2 bb = new BBB2();
			//bb.m3();
			new B1().new BBB1().m2();
		}
	}
}
