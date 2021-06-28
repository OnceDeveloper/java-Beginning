class A 
{
	String str = "김치"; //멤버
	A(int i){ //지역(파라미터)
		double d = 1.2;  //지역(선언초기화)
		System.out.println("A() str: " + str);
		System.out.println("A() i: " + i);
		System.out.println("A() d: " + d);	
	}
		void m(){
		System.out.println("m() str: " + str);
		//System.out.println("m() i: " + i);
		//System.out.println("m() d: " + d);
	}
	public static void main(String args[]){
		A a = new A(10);
		a.m();
	}
}

/*class AMgr
{
	public static void main(String args[]){
		A a = new A(10);
		a.m();
	}
}*/
