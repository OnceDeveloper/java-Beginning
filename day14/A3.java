class A3{
	int i = 10;
	void m(){
		System.out.println("A3 m()");
	}
	class AAAA{
		int j = 20;
		void m(){
			System.out.println("AAAA m()");
		}
	}
    static class AAAA2{
		int k = 30;
		void m(){
			System.out.println("AAAA2 m()");
		}
	}
}

class AUser3{
	public static void main(String[] args) 
	{
		A3.AAAA a1 = new A3().new AAAA();
		System.out.println(a1.j);
		a1.m();
		A3.AAAA2 a2 = new A3.AAAA2();
		System.out.println(a2.k);
		a2.m();
	}
}
