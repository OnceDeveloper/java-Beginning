class C //Single Thread 
{
	void m1(){
		System.out.println("�����Ѵ�");
	}
	void m2(){
		System.out.println("�丮�Ѵ�");
	}
	void m3(){
		System.out.println("����Ѵ�");
	}
	public static void main(String[] args) throws InterruptedException
	{
		C c= new C();
		while(true){
			c.m1();  
			Thread.sleep(1000);
			c.m2();
			Thread.sleep(1000);
			c.m3();
		}
	}
}
