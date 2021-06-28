class A {
	A(){
		System.out.println("A()");
	}
	void m1(){
		System.out.println("m1-1()");
		int r = m2(10);
		System.out.println("m1-2(), r: " + r);
	}
	int m2(int i){
		System.out.println("m2()");
		return i;
	}
	public static void main(String[] args) {
		System.out.println("main()-1");
		A a = new A();
		System.out.println("main()-2");
		a.m1();
		System.out.println("main()-3");
	}
}
