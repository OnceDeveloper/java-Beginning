class A 
{
	int m(){
		System.out.println("A�� m()");
		return 1;
	}
}
class AChild extends A
{
	public int m(){ //�������̵� 
		System.out.println("AChild�� m()");
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

