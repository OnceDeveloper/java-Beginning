//Boxing(JDK5이상) : 기본형 <-> Wrapper객체  
class D 
{
	void m1(){
		int i = 10;
		Integer iObj = i; //AutoBoxing 
		System.out.println("iObj: " + iObj);
	}
	void m2(){
		Integer iObj = new Integer(20);
		int i = iObj; //UnBoxing
		System.out.println("i: " + i);
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		d.m2();
	}
}
