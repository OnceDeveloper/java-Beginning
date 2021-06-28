class E 
{
	void m1(){
		int i=0;
		for(; i<3; i++);
			System.out.println("i: " + i);
	}
	void m2(){
		int i=0;
		int j=0;
		for(; (i+j)<6; i++, j++){
			System.out.println("i: " + i + ", j: " + j);
		}
	}
	void m3(){
		for(int j=0; j<2; j++){
			for(int i=0; i<3; i++){
				System.out.println("j: " + j + ", i: " + i);
			}
		}
	}
	public static void main(String[] args) {
		E e = new E();
		//e.m1();
		//e.m2();
		e.m3();
	}
}
