class A1 extends Object{
	int m(){
		System.out.println("A1의 m()");
		return 1;
	}
}
class AChild1 extends A1{
	public int m(){
		System.out.println("AChild1 m()");
		return -1;
	}
}
class AUser1{
	public static void main(String[] args){
		A1 a = new AChild1();
		int r = a.m();//AChild에서 오버라이딩되어 -1이 출력된다.
		System.out.println("r : " +r);
	}
}

/*
접근 제한자(넓은 범위 ->좁은 범위)
public -> protected -> default -> private
오버라이딩 시 자식은 접근제한자가 부모 접근제한자의 같은 범위이상일때만 컴파일 가능하다
*/