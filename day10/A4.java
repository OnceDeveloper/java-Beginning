class A4{
	String name = "이순신";
	int age = 10;
	
	A4(){}
	A4(String name){
		this.name = name;
	}
}

class AChild4 extends A4{

	 AChild4(){
		//super();
		System.out.println(super.name);//이순신을 부름
		//super("홍길동");
	}

}

class AUser4{
	public static void main(String[] args) 
	{	
		A4 a = new AChild4();//AChild4에서 A4의 생성자를 호출하여 "이순신"이 찍힘

		System.out.println(a.name);//A4의 name인 "이순신"이 찍힘
	}
}
