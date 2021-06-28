class B { //Outter 
	private int i = 10;
	private static int ii = 11;
	private void m1(){
		System.out.println("B의 m1()");
	}
	private static void m11(){
		System.out.println("B의 m11()");
	}
	
	class BB1 { //Inner1 
		int j = 20;
		void m2(){
			System.out.println("i: " + i); //이유 
			m1();//이유 

			System.out.println("BB1의 m()");
		}
	}
	static class BB2 { //Inner2 
		int k = 30;
		void m3(){
			System.out.println("ii: " + ii); //이유 
			m11(); //이유 
		   
			System.out.println("BB2의 m()");
		}
		public static void main(String args[]){
			 //BB2 bb2 = new BB2();
			 //System.out.println("bb2.k: " + bb2.k);
			 //bb2.m3();

			 new B().new BB1().m2();
		}
	}
}