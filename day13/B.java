class MyException extends Exception  {
	void m1(){
		System.out.println("MyException m1()");
	}
}
class YourException extends Exception  {
	void m2(){
		System.out.println("YourException m2()");
	}
}

class B
{
	boolean flag1 = false;
	boolean flag2 = false;
	boolean flag3 = true;

	B() throws Exception  {
		if(flag1) throw new Exception();	
	}
	void use1() throws MyException {
		if(flag2) throw new MyException();	
	}
	void use2() throws YourException {
		if(flag3) throw new YourException();	
	}

	public static void main(String args[]) //throws MyException  
	{
		//new B();
		try{
			System.out.println("0");
			B b = new B();
			System.out.println("1");
			b.use1();
			System.out.println("2");
			b.use2();
            System.out.println("예외 발생 안함");
		}catch(YourException ye){
			System.out.println("use2()에서 예외 발생 했음");
			ye.m2();
		}catch(MyException me){
			System.out.println("use1()에서 예외 발생 했음");
			me.m1();
		}catch(Exception e){
			System.out.println("B()에서 예외 발생 했음");
		}
	}
}
