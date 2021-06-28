class B3{
	//오버로딩
	B3(){}
	B3(String name){
	}
	
	int m(int i){
		System.out.println("mi");
		return i;
	}
	
	long m(short s){
		System.out.println("ms");
		return s;
	}

}
class BUser3{
	public static void main(String[] args) 
	{
		B3 b = new B3();
		long r = 20;
		b.m((short)r);

	}
}
