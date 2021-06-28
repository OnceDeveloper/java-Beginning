class ServingMan1 implements Runnable{
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("서빙 한다");
			
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
class Chef1 extends Thread{
	public void run(){
		for(int i=0; i<3; i++){
			System.out.println("요리 한다.");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class COwner1{
	COwner1(){
		new Thread(new ServingMan1()).start();//Runnable 상속이라 Thread 객체 필요
		new Chef1().start();//Thread 상속이라 Thread객체 만들어줄 필요가 없음
		new Thread(new ServingMan1()).start();
		new Chef1().start();
		pay();
	}
	void pay(){
		for(int i=3; i>0; i--){
			System.out.println("계산 한다");
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
