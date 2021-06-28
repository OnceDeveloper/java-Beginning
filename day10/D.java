class D {
	String name = "이순신";
    D(){}
	D(String name){
		this.name = name;
	}
	void m(){
		System.out.println("D의 m()");
	}
}
class DChild extends D {
	String name = "홍길동";
	DChild(){
		//super(name); //(1) 부모의 생성자
	}
	void m(){ //오버라이딩
		System.out.println("DChild의 m()");
	}
	void old(){
		super.m(); //(2) 오버라이딩전의 부모메소드 호출
		System.out.println("super.name: " + super.name); //(3) 이름이 같은 부모멤버를 자식에서 호출할 때 
	}
}


class DUser {
	public static void main(String[] args) {
		DChild d = new DChild();
		d.old();
	}
}