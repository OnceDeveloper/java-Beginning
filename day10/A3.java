class A3{
	protected String m(){
		System.out.println("A3의 메소드");
		return "김치";
	}
}

class AChild3 extends A3{
	protected String m(){
		System.out.println("AChild3의 메소드");
		return "깍두기";
	}
}

class AUser3{
	public static void main(String[] args) 
	{
		A3 a = new AChild3();
		String r = a.m();
		System.out.println(r);
	}
}
