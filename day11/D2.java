abstract class D2{
	int i;
	void m1(){
		System.out.println("m1");
	}
	abstract void m2();
}

class DChild2 extends D2{
	void m2(){
		i=2;
	}
}

class DUser2{
	public static void main(String[] args) 
	{
		D2 d = new DChild2();
		d.m2();//오버라이딩되어서 i = 0 에서 2로 바뀜
		System.out.println(d.i);//2로바뀐 i가 출력됨
	}
}
