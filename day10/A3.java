class A3{
	protected String m(){
		System.out.println("A3�� �޼ҵ�");
		return "��ġ";
	}
}

class AChild3 extends A3{
	protected String m(){
		System.out.println("AChild3�� �޼ҵ�");
		return "��α�";
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
