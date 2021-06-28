interface C1{
	void m1();
}
interface C2{
	void m2();
}
interface C3 extends C1,C2{
	void m3();
}


class C extends Object implements C3{

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
		C c = new C();
		C3 c3 = c;
		C1 c1 = c3;
		C2 c2 = c3;

		c.m1(); c.m2(); c.m3();//c로 호출하면 m1, m2, m3다 가능 C의 객체이기때문에
		System.out.println();
		c3.m1(); c3.m2(); c3.m3();//c3으로 호출하면 m1, m2, m3 다 가능 C의 부모이면서 C와 같은 메소드만 갖고 있으니까
		System.out.println();
		c1.m1();//c1으로 호출하면 C1에 있는 m1만 호출가능
		c2.m2();//c2으로 호출하면 C2에 있는 m2만 호출가능

		
		
		
		
	}
}
