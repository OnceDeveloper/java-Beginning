class GChild extends Thread
{
	public void run(){
		System.out.println("���� ������ ����!");
		boolean flag = true;
		while(flag){
			System.out.println("���� �������� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("���� ������ ��!");
	}
}
class E extends Thread 
{
	E(){
		start();
		boolean flag = true;
		while(flag){
			System.out.println("���� �������� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
	}
	public void run(){
		System.out.println("�ڽ� ������ ����!");
		new GChild().start();
		boolean flag = true;
		while(flag){
			System.out.println("�ڽ� �������� ��");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
		}
		System.out.println("�ڽ� ������ ��!");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main������ ����!");
		new E();
        System.out.println("Main������ ��!");
	}
}
