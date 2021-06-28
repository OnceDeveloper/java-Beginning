class Gchild1 implements Runnable{
	public void run(){
		System.out.println("손자 쓰레드 시작!");
		for(int i=0; i<3; i++){
			System.out.println("손자 쓰레드의 일");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("손자 쓰레드 끝!");
	}
}

class E1 extends Thread{
	E1(){
		start();//E1의(자식) run 호출
		new Thread(new Gchild1()).start();//Gchild1의(손자) run 호출
		for(int i=0; i<3; i++){
			System.out.println("메인 쓰레드의 일");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}

	}
	public void run(){
		System.out.println("자식 쓰레드 시작");
		for(int i=0; i<3; i++){
			System.out.println("자식 쓰레드 일");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println("자식 쓰레드 끝");
	}

	public static void main(String[] args){
		System.out.println("Main쓰레드 시작");
		new E1();
		System.out.println("Main쓰레드 끝");

	}
}
