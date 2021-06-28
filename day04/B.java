class B 
{
	int i = 10 ; //객체소속변수
	static int j = 20; //클래스소속변수

	/*void m(){ 불가!!
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

        //공유 
		System.out.println("j2: " + b1.j);
		System.out.println("j3: " + b2.j);
	}
}
