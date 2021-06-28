class F 
{
	char c = '°¡';
	long lo = 1L;

	long max = Long.MAX_VALUE;
	
	void m1(){
		long r = c + lo; 
		System.out.println("r: " + (char)r);
	}
	void m2(){
		System.out.println("max: " + max);
	}
	public static void main(String[] args) 
	{
		F f= new F();
		//f.m1();
		f.m2();
	}
}
