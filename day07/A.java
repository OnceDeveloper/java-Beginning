class A 
{
	String str0 = "봄";
	String str1 = "여름";
	String str2 = "가을";
	String str3 = "겨울";

    //String items[]; //(1)선언 
	String items[] = new String[4]; //선언 및 생성 
	void in(){
		//items = new String[4]; //(2)생성 
		items[0] = str0; //(3)초기화 
		items[1] = str1;
		items[2] = str2;
		items[3] = str3;
	}
	void out(){
		for(int i=0; i<items.length; i++){
			System.out.println("items["+i+"]: " + items[i]);
		}
	}
	public static void main(String[] args) {
		A a = new A();
		a.in();
		a.out();
	}
}
