class C { //Outter 
	private int i = 10;
	private static int ii = 11;
	void m1(){
		System.out.println("C�� m1()");
	}
	private static void m11(){
		System.out.println("C�� m11()");
	}
	int getI(){
		return i;
	} 

	C(){
		new CC1(this).m2();	
	}
}

class CC1 { 
	C c;
	CC1(C c){
		this.c = c;
	}

	int j = 20;
	void m2(){
		System.out.println("c.i: " + c.getI()); //���� 
		c.m1();//���� 

		System.out.println("CC1�� m()");
	}
}

class CUser {
	CUser(){
		C c = new C();
	}
	public static void main(String args[]){
		new CUser();
	}
}