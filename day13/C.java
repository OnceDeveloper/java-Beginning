class C 
{
	int i = 10; 
	void m() throws MyException, YourException, Exception {
		if(i<10) throw new MyException();
		else if(i>10) throw new YourException();
		//else throw new Exception();
	}
	public static void main(String[] args) {
		C c = new C();
		try{
			c.m();
		}catch(MyException me){
			System.out.println(me.toString());
		}catch(YourException ye){
			System.out.println(ye.toString());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
