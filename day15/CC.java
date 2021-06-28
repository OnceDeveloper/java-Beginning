class ServingMan implements Runnable {
	public void run() {
		while(true){
			System.out.println("서빙 한다");
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){}
		}
	}
}
class Chef extends Thread {
	public void run() {
		while(true){
			System.out.println("요리 한다");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
}

class COwner //MultiThread 
{
	COwner() throws InterruptedException {
        new Thread(new ServingMan()).start();
		//new Thread(new ServingMan()).start();
		new Chef().start();
		//new Chef().start();
		pay();
	}
	void pay() throws InterruptedException {
		while(true){
			System.out.println("계산 한다");
			Thread.sleep(2000);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		new COwner();
	}
}
