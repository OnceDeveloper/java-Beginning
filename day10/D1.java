class D1{
	String name = "이순신";
	D1(){
	}
	D1(String name){
		this.name = name;
	}
	void m(){
		System.out.println("D1의 m()");
	}
}
class DChild1 extends D1{
	String name = "홍길동";
	DChild1(){
		super();
		System.out.println(name);
	}
	void m(){
		System.out.println("DChild1의 m()");
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
