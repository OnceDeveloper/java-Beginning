interface C1{
	void m1();
}
interface C2{
	void m2();
}
interface C3 {
	void m3();
}

class CC extends Object implements C1,C2,C3{

	public void m1(){
		System.out.println("m1");
	}
	public void m2(){
		System.out.println("m2");
	}
	public void m3(){
		System.out.println("m3");
	}

	public static void main(String[] args) 
	{
			CC c = new CC();
			C1 c1 = c;
			C2 c2 = c;
			C3 c3 = c;
			c.m1(); c.m2(); c.m3();//CC의 객체니까 전부 사용 가능
			c1.m1();//CC에서 C1로 형변환(자식->부모)로 한 거니까 m1만 사용가능
			c2.m2();//CC에서 C2로 형변환(자식->부모)로 한 거니까 m2만 사용가능
			c3.m3();//CC에서 C3로 형변환(자식->부모)로 한 거니까 m3만 사용가능
	}
}
