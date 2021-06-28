class GChild extends Thread
{
	public void run(){
		System.out.println("손자 쓰레드 시작!");
		boolean flag = true;
		while(flag){
			System.out.println("손자 쓰레드의 일");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("손자 쓰레드 끝!");
	}
}
class E extends Thread 
{
	E(){
		start();
		boolean flag = true;
		while(flag){
			System.out.println("메인 쓰레드의 일");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
	public void run(){
		System.out.println("자식 쓰레드 시작!");
		new GChild().start();
		boolean flag = true;
		while(flag){
			System.out.println("자식 쓰레드의 일");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("자식 쓰레드 끝!");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main쓰레드 시작!");
		new E();
        System.out.println("Main쓰레드 끝!");
	}
}
