class D 
{
	void m(){
		try{
			System.out.println("1");
			new C().m();
			System.out.println("2");
			return;
		}catch(MyException me){
			System.out.println("3");
		}catch(YourException ye){
			System.out.println("4");
		}catch(Exception e){
			System.out.println("5");
		}finally{
			System.out.println("7");
		}
		System.out.println("8");
	}
	public static void main(String[] args) 
	{
		new D().m();
		System.out.println("main()");
	}
}
