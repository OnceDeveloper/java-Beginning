class B2{
	//오버로딩
	B2(){}
	B2(String name){}

	//오버로딩
	int m(int i){
		System.out.println("int m(int i)");
		return i;
	}
	short m(short s){
		System.out.println("short m(short s)");
		return s;
	}
}

class BUser2{
	public static void main(String[] args) 
	{
		B2 b = new B2();
		short r = 10;
		b.m(r);
		System.out.println(r);
	}
}
