interface C2{
	void m1();
}
interface C3{
	void m2();
}
interface C4 extends C2,C3{
	void m3();
}


class C1 implements C4{

	public void m1(){
		System.out.println("m1()");
	}
	public void m2(){
		System.out.println("m2()");
	}
	public void m3(){
		System.out.println("m3()");
	}

	public static void main(String[] args) 
	{
		C1 c = new C1();
		C4 c4 = c;
		C2 c2 = c4;
		C3 c3 = c4;
		c.m1(); c.m2(); c.m3();
	}
}
