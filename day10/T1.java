class T1 
{
	private String str = "점심"; //접근 불가 
	private void m(){ //접근 불가
		System.out.println("m()");
	}
}
class T1Child extends T1
{
	public static void main(String args[]){
		T1Child t = new T1Child();
		//System.out.println("t.str: " + t.str);
		//t.m();
	}
}
