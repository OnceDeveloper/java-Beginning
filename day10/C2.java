class C2{
	String kimchi;
	void m(String kimchi){
		this.kimchi=kimchi;
	}
	
	String name;
	C2(){
		this("�̼���");
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
		c.m("��α�");
		System.out.println("c.kimchi: " + c.kimchi);
		System.out.println("c.name: " + c.name);
	}
}
