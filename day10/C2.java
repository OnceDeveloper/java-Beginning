class C2{
	String kimchi;
	void m(String kimchi){
		this.kimchi=kimchi;
	}
	
	String name;
	C2(){
		this("ÀÌ¼öºó");
		CFriend2 c = new CFriend2(this);
		/*CFriend2 c = new CFriend2();
		c.setC(this);*/
		c.use();
	}
	C2(String name){
		this.name=name;
	}

	public static void main(String[] args) 
	{
		new C2();
	}
}
class CFriend2{
	C2 c;

	CFriend2(C2 c){
		this.c = c;
	}
	/*void setC(C c){
		this.c = c;
	}*/
	void use(){
		c.m("±ïµÎ±â");
		System.out.println("c.kimchi: " + c.kimchi);
		System.out.println("c.name: " + c.name);
	}
}
