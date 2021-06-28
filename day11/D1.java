abstract class D1{//추상 클래스 , 추상 메소드가 하나라도 있다면 abstract를 꼭 붙여야 함!
	
	//abstract int i;//안됨
	//abstract D();//안됨
	
	int j = 10;
	abstract void m1();//추상 메소드는 바디를 생략해야함
	abstract void m2();
	void m3(){
		System.out.println("D1의 m3() 일반메소드");
	}
}

class DChild1 extends D1{
	void m1(){
		//System.out.println("ㅇㅇ");
	}
	void m2(){
				//System.out.println("ㅇㅇ1");
	}
}
class DUser1{
	public static void main(String[] args) 
	{
		D1 d = new DChild1();

		System.out.println("d.j : " +d.j);
		d.m1();
		d.m2();
		d.m3();
	}
}