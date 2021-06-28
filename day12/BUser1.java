import aa.bb.B1;

class BChild1 implements B1{
	public void m1(){
		System.out.println("오버라이딩된 B1의 메소드");
	}
}

class BUser1{
	void use(){
		System.out.println(B1.i);//B.i는 public이며 static이며 final인 것!
		B1.m2();//m2()는 public static인 것!
		//static가 붙으면 클래스 소유가 된다.
		//원래 static이 붙으면 객체를 생성해서 쓸 수도 있는데 인터페이스에는 객체로 생성하여 쓸 수가없다.
		
		B1 b = new BChild1();
		b.m1();
		b.m3();

	}
	
	public static void main(String[] args) 
	{
		BUser1 b = new BUser1();
		b.use();
	}
}