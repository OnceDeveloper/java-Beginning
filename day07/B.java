class B 
{
	String str0 = "봄";
	String str1 = "여름";
	String str2 = "가을";
	String str3 = "겨울";

    String items[] = {str0, str1, str2, str3}; //선언 및 생성 및 초기화
	void in(){ 
	}
	void out(){
		for(int i=0; i<items.length; i++){
			System.out.println("items["+i+"]: " + items[i]);
		}
	}
	public static void main(String[] args) {
		B b = new B();
		b.in();
		b.out();
	}
}
