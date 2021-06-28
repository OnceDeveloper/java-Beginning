class B 
{
	int i; //按眉家加
	static int j; //努贰胶家加  

    void m(){
		i++;
        j++;
	}

	public static void main(String[] args) {
		B b1 = new B(); //1
		B b2 = new B(); //2
		b1.m(); b2.m();

		System.out.println("b1.i: " + b1.i);
		System.out.println("b2.i: " + b2.i);
		System.out.println();

		System.out.println("b1.j: " + b1.j);
        System.out.println("b2.j: " + b2.j);
		System.out.println("B.j: " + B.j);
		System.out.println("j: " + j);
	}
}
