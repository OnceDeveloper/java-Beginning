class G 
{
	float f = 9223372036854775807.123456789f;
	double d = 9223372036854775807.123456789;
	void m1(){
		System.out.println("f: " + f); 
		System.out.println("d: " + d); 
	}

    double f2 = 100.1234;
	double d2 = 200.1234;
	void m2(){
		System.out.println("°á°ú: "+ (f2+d2) );
	}
	public static void main(String[] args) 
	{
		G g = new G();
		//g.m1();
		g.m2();
	}
}
