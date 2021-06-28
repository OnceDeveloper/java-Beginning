class C 
{
	int m1(){
		int i=0;
		for(; i<3; i++){
			if(i==3) return i;
			System.out.println("i: " + i);
		}
		System.out.println("for¹Û");

		return i;
	}
	public static void main(String[] args) 
	{
		C c = new C();
		System.out.println("main()-1");
		int r = c.m1();
		//c.m1();
		System.out.println("main()-2 r: " + r);
	}
}
