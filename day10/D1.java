class D1{
	String name = "�̼���";
	D1(){
	}
	D1(String name){
		this.name = name;
	}
	void m(){
		System.out.println("D1�� m()");
	}
}
class DChild1 extends D1{
	String name = "ȫ�浿";
	DChild1(){
		super();
		System.out.println(name);
	}
	void m(){
		System.out.println("DChild1�� m()");
	}
	void old(){
		super.m();
		System.out.println("super.name : " +super.name);
	}
}
class DUser1{
	public static void main(String[] args) 
	{
		DChild1 d = new DChild1();
		d.old();
	}
}
