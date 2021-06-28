class A1{//Outer
	int i =10;
	void m(){
		System.out.println("AÀÇ m()");
	}
	class AA1{//Inner1
		int j = 20;
		void m(){
			System.out.println("AA1ÀÇ m()");
		}
	}
	static class AA2{//Inner2
		int k = 30;
		void m(){
			System.out.println("AA2ÀÇ m()");
		}
	}
}

class AUser1{
	public static void main(String[] args) 
	{
		A.AA1 aa1 = new A().new AA1();
		System.out.println("aa1.j:"+aa1.j);
		aa1.m();

		A.AA2 aa2 = new A.AA2();
		System.out.println("aa2.k :"+aa2.k);
		aa2.m();
	}
}
