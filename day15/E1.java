class Gchild1 implements Runnable{
	public void run(){
		System.out.println("���� ������ ����!");
		for(int i=0; i<3; i++){
			System.out.println("���� �������� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("���� ������ ��!");
	}
}

class E1 extends Thread{
	E1(){
		start();//E1��(�ڽ�) run ȣ��
		new Thread(new Gchild1()).start();//Gchild1��(����) run ȣ��
		for(int i=0; i<3; i++){
			System.out.println("���� �������� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}

	}
	public void run(){
		System.out.println("�ڽ� ������ ����");
		for(int i=0; i<3; i++){
			System.out.println("�ڽ� ������ ��");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println("�ڽ� ������ ��");
	}

	public static void main(String[] args){
		System.out.println("Main������ ����");
		new E1();
		System.out.println("Main������ ��");

	}
}
