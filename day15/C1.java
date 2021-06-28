class C1{

	void m1(){
		System.out.println("서빙한다");
	}
	void m2(){
		System.out.println("요리한다");
	}
	void m3(){
		System.out.println("계산한다");
	}

	public static void main(String[] args) throws Exception {
		C1 c = new C1();
		while(true){
			c.m1();
			Thread.sleep(1000);
			c.m2();
			Thread.sleep(1000);
			c.m3();
			Thread.sleep(1000);
		}
	}
}
