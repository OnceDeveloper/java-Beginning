class C2{
	void m1(){
		System.out.println("�����Ѵ�");
	}
	void m2(){
		System.out.println("�丮�Ѵ�");
	}
	void m3(){
		System.out.println("����Ѵ�");
	}
	public static void main(String[] args) throws Exception{
		C2 c = new C2();
		for(int i=0; i<3; i++){
		c.m1();
		Thread.sleep(1000);
		c.m2();
		Thread.sleep(1000);
		c.m3();
		Thread.sleep(1000);
		}
	}
}
