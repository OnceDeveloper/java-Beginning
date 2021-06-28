class ServingMan2 implements Runnable{
	public void run() {
		for(;;){
			System.out.println("서빙 한다");
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

class Chef2 extends Thread {
	public void run() {
		for(;;){
			System.out.println("요리 한다");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class COwner2 {
	COwner2()throws Exception{
		new Thread(new ServingMan2()).start();
		new Chef2().start();
		pay();
	}
	void pay()throws Exception{
		for(;;){
			System.out.println("계산 한다");
			Thread.sleep(2000);
		}

	}
	public static void main(String[] args) throws Exception{
		new COwner2();
	}
}
