class A2{
	static int i = 20;
	A2(){}
	static void m(){
		System.out.println(i);
	}
}

class AUser2{
	public static void main(String[] args) 
	{
		A2.m();
	}
}
