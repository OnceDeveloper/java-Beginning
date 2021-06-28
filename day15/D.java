class D extends Thread 
{
	D(){
		//System.out.println("max: " + Thread.MAX_PRIORITY); //10 
		//System.out.println("min: " + Thread.MIN_PRIORITY); //1
		//System.out.println("nor: " + Thread.NORM_PRIORITY); //5 

        this.start();
		try{
			join();
		}catch(InterruptedException ie){} //main쓰레드가 멈춤

		int p1 = getPriority();
		System.out.println("p1: " + p1);

		setPriority(8);
		int p2 = getPriority();
		System.out.println("p2: " + p2);
	}
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("일을 한다");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("자식 쓰레드가 죽었다");
	}
	public static void main(String[] args) 
	{
		new D();
		System.out.println("main 쓰레드가 죽었다");
	}
}
