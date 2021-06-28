class T3 
{
	void m1(){
		System.out.println("소포를 보내줘1");
	}
	영수증 m2(){
		System.out.println("소포를 보내줘2 and 잔액을 갖다줘");
		return new 영수증("우체국", 2000);
	}
	public static void main(String[] args) 
	{
		T3 t = new T3();
		t.m1();
	    영수증 rep = t.m2();
	    System.out.println("금액: " + rep.금액);
		System.out.println("상호: " + rep.상호);
	}
}
class 영수증 
{
	String 상호;
	long 금액;
	
	영수증(String 상호, long 금액){
	   this.상호 = 상호;
       this.금액 = 금액;
	}
}
