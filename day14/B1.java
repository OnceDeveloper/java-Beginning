class B1{//Outter
	private int i = 10;
	private static int ii = 11;//static
	private void m1(){
		System.out.println("B1�� m1()");
	}
	private static void m11(){
		System.out.println("B1�� m11()");
	}

	class BBB1{
		int j = 20;
		void m2(){
			System.out.println("i : " +i);//B1�� ���� �ڱ� ��ó�� �� �� �ִ�.
			m1();
			System.out.println("static ii : "+ii);
			System.out.println("BBB1�� m()");
		}
	}
	static class BBB2{//static Ŭ���������� static �ڿ��� ���� �����ϴ�./main�� ������ static Ŭ������ �Ǿ�� �Ѵ�.
		int k =30;
		void m3(){
			//System.out.println("i : " +i);
			System.out.println("ii : "+ii);
			m11();

			System.out.println("BBB2�� m()");
		}
		public static void main(String args[]){
			//BBB2 bb = new BBB2();
			//bb.m3();
			new B1().new BBB1().m2();
		}
	}
}
