class ServingMan1 implements Runnable{
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("���� �Ѵ�");
			
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
class Chef1 extends Thread{
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("�丮 �Ѵ�.");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class COwner1{
	COwner1(){
		new Thread(new ServingMan1()).start();//Runnable ����̶� Thread ��ü �ʿ�
		new Chef1().start();//Thread ����̶� Thread��ü ������� �ʿ䰡 ����
		new Thread(new ServingMan1()).start();
		new Chef1().start();
		pay();
	}
	void pay(){
		for(int i=3; i>0; i--){
			System.out.println("��� �Ѵ�");
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
	
	public static void main(String[] args) 
	{
		new COwner1();
	}
}
