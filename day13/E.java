class E 
{
	void m(){
		try{
			System.out.println("m()");
			//System.exit(0); //정상종료
			System.exit(-1); //비정상종료
		}finally{
			System.out.println("finally");
		}
	}
	public static void main(String[] args) 
	{
		E e = new E();
		e.m();
	}
}
