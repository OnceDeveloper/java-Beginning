class H 
{
	byte b = 10;
	short s = 20;

	void m(){
		int r = b + s;
		System.out.println("r: " + r); 
	}
	public static void main(String[] args) 
	{
		new H().m();
	}
}
