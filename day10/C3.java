class C3{
	String kimchi;
	void m(String kimchi){
		this.kimchi = kimchi;
	}
	String name;
	C3(){
		this("ÀÌ¼öºó");
		CFriend3 c = new CFriend3(this);
		c.use();
		
	}
	C3(String name){
		this.name = name;
	}
	
	public static void main(String[] args) 
	{
		new C3();
	}
}
class CFriend3{
	C3 c;

	CFriend3(C3 c){
		this.c = c;
	}
	void use(){
		c.m("¿­¹«±èÄ¡");
		System.out.println(c.kimchi+"\t"+c.name);
	}
}
