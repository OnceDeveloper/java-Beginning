class Tip  
{
	String str1 = "��ġ";
	String str2 = "��ġ";
	String str3 = "��α�";
	
	void m1(){
		if(str1.equals(str1)){
			System.out.println("m1() ������ ����");
		}else{
			System.out.println("m1() ������ �ٸ���");
		}
	}
	void m2(){
		if(str1.equals(str3)){
			System.out.println("m2() ������ ����");
		}else{
			System.out.println("m2() ������ �ٸ���");
		}
	}
	public static void main(String[] args) {
		Tip t = new Tip();
		//t.m1();
		t.m2();
	}
}
