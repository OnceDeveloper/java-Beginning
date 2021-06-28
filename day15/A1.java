class A1 extends Thread{

	A1(){
		start();
	}
	public void run(){
		while(true){
			System.out.println("Thread by Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	void m(){
		while(true){
			System.out.println("Thread main Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		A1 a = new A1();
		a.m();
	}
}
