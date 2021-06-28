class Tip  
{
	String str1 = "김치";
	String str2 = "김치";
	String str3 = "깍두기";
	
	void m1(){
		if(str1.equals(str1)){
			System.out.println("m1() 내용이 같다");
		}else{
			System.out.println("m1() 내용이 다르다");
		}
	}
	void m2(){
		if(str1.equals(str3)){
			System.out.println("m2() 내용이 같다");
		}else{
			System.out.println("m2() 내용이 다르다");
		}
	}
	public static void main(String[] args) {
		Tip t = new Tip();
		//t.m1();
		t.m2();
	}
}
