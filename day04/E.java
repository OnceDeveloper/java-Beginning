class E
{
	int i = 10;
	long j = 20;
    void m(){
	   int r = i + (int)j;
	   System.out.println("r: " + r);
	}
	public static void main(String[] args) 
	{
		new E().m();
	}
}
