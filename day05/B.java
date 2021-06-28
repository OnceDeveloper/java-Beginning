class B 
{
	B(){}
	void m1(){
		int i=11;
		if(i>10){
			BB.m2();//m2()에 static이 붙어서 클래스소속 변수이기에
					//굳이 객체를 새로 생성하지 않고 호출이 가능하다.
			//new BB().m2(); 객체를 생성하고 호출하는 방법이다.
		}else if(i<10){
			System.out.println("i는 10보다 작다");
		}else{
			System.out.println("i는 10이다");
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.B();
		b.m1();
	}
}
