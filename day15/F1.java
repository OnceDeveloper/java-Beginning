class F1 implements Runnable{

	int i = 0;
	F1(){
		new Thread(this).start();
		new Thread(this).start();
	}
	synchronized void m1(){//m1�޼ҵ� ��ü(i++,i ���) lock
		i++;
		System.out.println("i : "+i);
	}
	void m2(){
		synchronized(this) {//i++�� lock
			i++;
		}
		System.out.println("i : "+i);
	}

	public void run(){
		m1();
	}

	public static void main(String[] args) 
	{
		new F1();
	}
}
