class B implements Runnable 
{
	B(){
		//Runnable r = this;//����ȯ B->Runnable
		Thread th = new Thread(this);
		th.start();
	}
	public void run(){ //�������̵� 
		while(true){
			System.out.println("Baby Thread by Runnable");
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
		B b = new B();
		b.m();
	}
}
