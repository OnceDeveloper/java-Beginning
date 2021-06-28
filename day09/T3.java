class T3 
{
	String str1 = new String("짜장");
	String str2 = new String("짬뽕");
	String str3 = new String("짜장");
	String str4 = "개구리";
	void m1(){
		if(str1 == str3){
			System.out.println("주소가 같다");
		}else{
			System.out.println("주소가 다르다");
		}
	}
	void m2(){
		String item = "";
		if(str1.equals(str3)){
			System.out.println("내용이 같다");
		}else{
			System.out.println("내용이 다르다");
		}
	}

	String str = "개구리";
	void m3(){
		if(str4 == str){
			System.out.println("같은 객체다");
		}else{
			System.out.println("다른 객체다");
		}
	}
	public static void main(String[] args) 
	{
		T3 t = new T3();
		//t.m1();
		//t.m2();
		t.m3();
	}
}
