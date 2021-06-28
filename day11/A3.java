class A3{
	static String str = "안녕";
	A3(){}
	void m(){
		System.out.println(str+1);
	}
}

class AUser3{
	public static void main(String[] args) 
	{
		System.out.println(A3.str);
		new A3().m();//m()은 static이 아니라 객체를 생성 후 호출해줘야 함
	}
}
