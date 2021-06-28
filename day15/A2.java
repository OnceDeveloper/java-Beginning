class A2 extends Thread{
	A2(){
		this.start();
		Thread tr = new Thread(this);
		tr.start();
		m();
	}
	public void run(){
		for(int i=0; i<2; i++){
			System.out.println("baby Thread by Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	void m(){
		for(int i=0; i<2; i++){
			System.out.println("main Thread");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		new A2();
	}
}
