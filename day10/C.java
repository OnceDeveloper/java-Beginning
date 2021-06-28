class C 
{
	String str; //°´Ã¼¼Ò¼Ó 
	void m(String str){
		this.str = str; //(1) 
	}
	private void m(){
		System.out.println("CÀÇ m()");
	}

    String name;
    C(){
		this("ÀÌ¼öºó"); //(2)
		//CFriend f = new CFriend(this); //(3) 
		CFriend f = new CFriend();
		f.setC(this);
		f.use();
	}
	C(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		C c = new C();
		c.m();
	}
}

class CFriend
{
	C c;

    /*CFriend(C c){
		this.c = c;
	}*/
	void setC(C c){
		this.c = c;
	}
	void use(){
		c.m("±ïµÎ±â");
		//c.m();
		System.out.println("c.str: " + c.str);
		System.out.println("c.name: " + c.name);

		//System.out.println("#name: " + name);
	}
}
