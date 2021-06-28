class C 
{
	int i = 20;
	void m1(){
		switch(i){
			case 10: System.out.println("i는 10이다"); break;
			case 20: 
				System.out.println("i는 20이다(1)");
				System.out.println("i는 20이다(2)");
				break;
			case 30: System.out.println("i는 30이다"); break;
			default: System.out.println("i는 10 or 20 or 30이 아니다"); 
		}
		System.out.println("switch블럭 나옴");
	}

	void m2(){
		String str = "김치";
		switch(str){
			case "깍두기": System.out.println("난 깍두기"); break;
			case "김치": System.out.println("난 김치");
		}
	}
	public static void main(String[] args) 
	{
		C c = new C();
		//c.m1();
		c.m2();
	}
}
