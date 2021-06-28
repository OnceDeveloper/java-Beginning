class A2 extends Object{
	 int m(){
		System.out.println("m");
		return 1;
	}
}
class AChild2 extends A2{
	protected int m(){//부모의 메소드는 default형이므로 자식은 default이상의 넓은 범위를 쓸 수 있기 때문에
					  // public , protected, default가 올 수 있다.
		System.out.println("child m");
		return -1;
	}
}

class AUser2{
	public static void main(String[] args) 
	{
		A2 a = new AChild2();
		//a.m();
		long r = a.m();//JVM이 반환값 int형을 long형으로 자동형변환해줌
		//byte r = (byte)a.m();//반환값 int형은 byte보다 크기에 강제 형변환해줌
		System.out.println(r);
	}
}
