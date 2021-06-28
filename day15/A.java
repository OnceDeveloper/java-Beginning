class A extends Thread 
{
	A(){
		start();
	}
	public void run(){//오버라이딩 
		while(true){
			System.out.println("Baby Thread by Thread");
			try{
				Thread.sleep(1000); //ms
			}catch(Exception e){}
		}
	}
	void m(){
		while(true){
			System.out.println("Main Thread");
			try{
				Thread.sleep(1000); //ms
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m();
	}
}
