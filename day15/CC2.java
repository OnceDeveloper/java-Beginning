class ServingMan2 implements Runnable{
	public void run() {
		for(;;){
			System.out.println("���� �Ѵ�");
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

class Chef2 extends Thread {
	public void run() {
		for(;;){
			System.out.println("�丮 �Ѵ�");
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
			System.out.println("��� �Ѵ�");
			Thread.sleep(2000);
		}

	}
	public static void main(String[] args) throws Exception{
		new COwner2();
	}
}
