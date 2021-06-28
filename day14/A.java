class A { //Outter 
	int i = 10;
	void m(){
		System.out.println("A狼 m()");
	}

	class AA1 { //Inner1 
		int j = 20;
		void m(){
			System.out.println("AA1狼 m()");
		}
	}
	static class AA2 { //Inner2 
		int k = 30;
		void m(){
			System.out.println("AA2狼 m()");
		}
	}
}

class AUser
{
	public static void main(String args[]){
		A.AA1 aa1 = new A().new AA1(); //按眉积己 
		System.out.println("aa1.j: " + aa1.j);
		aa1.m();

		A.AA2 aa2 = new A.AA2(); //按眉积己 
		System.out.println("aa2.k: " + aa2.k);
		aa2.m();
	}
}

