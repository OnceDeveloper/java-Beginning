class C4{
	String kim = "±èÄ¡";
	String name;

	void m(String kim){
		this.kim = kim;
	}

	C4(){
		this("ÀÌ¼öºó");
		CFriend4 f = new CFriend4(this);
		f.use();

	}
	C4(String name){
		this.name = name;

	}
	public static void main(String[] args) 
	{
		new C4();
	}
}
class CFriend4{
	C4 c;

	CFriend4(C4 c){
		this.c = c;
	}
	void use(){
		c.m("±ïµÎ±â");
		System.out.println(c.kim);
	}
}
