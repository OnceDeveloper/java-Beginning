class A1{//static class A1은 불가능!! A1클래스는 클래스 소유다는 말이 안됨
	static int i = 10;
	A1(){}//생성자도 static이 불가능
	static void m(){
		System.out.println("A의 m()");
		i++;
		System.out.println(i);
	}
	void m1(){
		System.out.println("A의 m1()");
		System.out.println(i);
	}
	public static void main(String args[]){	
		System.out.println(i);
		m();
		
	}
	
}
class AUser1{
	public static void main(String[] args){
		System.out.println(A1.i);
		A1.m();
	}
}
