class ServingMan implements Runnable {
	public void run() {
		while(true){
			System.out.println("���� �Ѵ�");
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){}
		}
	}
}
class Chef extends Thread {
	public void run() {
		while(true){
			System.out.println("�丮 �Ѵ�");
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
			System.out.println("��� �Ѵ�");
			Thread.sleep(2000);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		new COwner();
	}
}
