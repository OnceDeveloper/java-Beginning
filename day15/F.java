class F extends Thread //implements Runnable 
{
	int i = 0; 
	F(){
		//new Thread(this).start();
		//new Thread(this).start();

		Thread th1 = this; //부모로 형변환
		Runnable r = this; //조부모로 형변환
		Thread th2 = new Thread(r); 
		th1.start();
		th2.start();
	}
	synchronized void m1(){
		i++;
		System.out.println("i: " + i);
	}
	void m2(){
		synchronized(this){ //자신
			i++;
		}
		System.out.println("i: " + i);
	}
	public void run(){
		//m1();
		m2();
	}
	public static void main(String[] args) 
	{
		new F();
	}
}
