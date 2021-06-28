class F1 implements Runnable{

	int i = 0;
	F1(){
		new Thread(this).start();
		new Thread(this).start();
	}
	synchronized void m1(){//m1메소드 전체(i++,i 출력) lock
		i++;
		System.out.println("i : "+i);
	}
	void m2(){
		synchronized(this) {//i++만 lock
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
