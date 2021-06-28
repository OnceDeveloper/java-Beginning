class A2{
	int i = 10;
	void m(){
		System.out.println("A2ÀÇ m()");
	}
	class AAA1{
		int j =20;
		void m(){
			System.out.println("AAA1ÀÇ m()");
		}
	}
	static class AAA2{
		int k = 30;
		void m(){
			System.out.println("AAA2ÀÇ m()");
		}
	}
}

class AUser2{
	public static void main(String[] args) 
	{
		A2.AAA1 aaa1 = new A2().new AAA1();
		System.out.println(" j : "+aaa1.j);
		aaa1.m();
		A2.AAA2 aaa2 = new A2.AAA2();
		System.out.println(" k : "+aaa2.k);
		aaa2.m();
	}
}
