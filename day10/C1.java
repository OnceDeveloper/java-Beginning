class C1{
	String str;//��ü�Ҽ�
	void m(String str){
		this.str = str;
	}
	private void m(){
		System.out.println("C1�� m()");
	}

	String name;
	C1(){
		this("�̼���");
		CFriend1 f = new CFriend1(this);
		f.use();
	}
	C1(String name){
		this.name = name;
	}

	public static void main(String[] args) 
	{
		new C1();
	}
}
class CFriend1{
	C1 c;

	CFriend1(C1 c){
		this.c = c;
	}
	void use(){
		c.m("��α�");
		System.out.println("c.str : " +c.str);
		System.out.println("c.name : " +c.name);
	}
}
