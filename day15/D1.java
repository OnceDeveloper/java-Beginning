class D1 extends Thread{
	D1(){
		/*
		System.out.println("max : " +Thread.MAX_PRIORITY);//10
		System.out.println("norm: " +Thread.NORM_PRIORITY);
		System.out.println("min : " +Thread.MIN_PRIORITY);
		*/

		this.start();
		/*
		try{
			join();
		}catch(Exception e){}
		*/

		int p1 = getPriority();//run�� �켱������ �ǹ�
		System.out.println(p1);
		setPriority(8);
		int p2 = getPriority();
		System.out.println(p2);
	}
	
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("���� �Ѵ�.");
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
		System.out.println("�ڽ� �����尡 �׾���.");
	}

	public static void main(String[] args) 
	{
		new D1();
		System.out.println("main �����尡 �׾���.");
	}
}
