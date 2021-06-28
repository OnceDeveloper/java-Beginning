class A 
{
	static int i = 10;
    A(){}
	static void m(){
		System.out.println("AÀÇ m()");
	}

	public static void main(String args[]){
		System.out.println("i: " + i);
		m();
	}
}
class AUser
{
	public static void main(String args[]){
		System.out.println("A.i: " + A.i);
		A.m();
	}
}
