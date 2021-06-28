class B2 implements Runnable{
	B2(){
		Thread tr1 = new Thread(this);
		tr1.start();
		Thread tr2 = new Thread(this);
		tr2.start();
		m();
		
	}
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("ÀÚ½Ä Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

	void m(){
		for(int i=0; i<3; i++){
			System.out.println("main Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}

	public static void main(String[] args) 
	{
		new B2();
	}
}
