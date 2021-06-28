class A 
{
	int m(){
		System.out.println("A의 m()");
		return 1;
	}
}
class AChild extends A
{
	public int m(){ //오버라이딩 
		System.out.println("AChild의 m()");
		return -1;
	}
}

/*
class AUser 
{
	public static void main(String args[]){
		A a = new AChild();
		int r = a.m();
		System.out.println("r: " + r);
	}
}
*/

