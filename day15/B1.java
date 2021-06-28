class B1 implements Runnable{

	B1(){
		Thread tr1 = new Thread(this);
		tr1.start();
		Thread tr2 = new Thread(this);
		tr2.start();
	}

	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("Baby Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

	void m(){
		for(int i=0; i<3; i++){
			System.out.println("Main Thread m()");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

	public static void main(String[] args) 
	{
		B1 b = new B1();
		b.m();
	}
}
