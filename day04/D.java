class D 
{
	int i = 128;
    void m(){
		byte b = (byte)i;
		System.out.println("b : " + b);
	}
	public static void main(String[] args) 
	{
		new D().m();
	}
}
