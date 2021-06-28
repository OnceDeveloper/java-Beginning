abstract class D //추상클래스 
{
	//abstract int i; //안됨!
	//abstract D(); //안됨! 

	int j = 10;
	abstract void m(); //추상메소드 
	void m2(){ //일반메소드
		System.out.println("D의 m2()");
	}
}
class DChild extends D {
	void m(){ //오버라이딩 
		System.out.println("DChild의 m()");
	}
}

class DUser
{
	public static void main(String args[]){
		//추상클래스 D의 객체를 만드시요
		D d = new DChild();

		System.out.println("d.j: " + d.j);
		d.m();
		d.m2();
	}
}
