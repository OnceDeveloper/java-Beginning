class T3 
{
	String str1 = new String("¥��");
	String str2 = new String("«��");
	String str3 = new String("¥��");
	String str4 = "������";
	void m1(){
		if(str1 == str3){
			System.out.println("�ּҰ� ����");
		}else{
			System.out.println("�ּҰ� �ٸ���");
		}
	}
	void m2(){
		String item = "";
		if(str1.equals(str3)){
			System.out.println("������ ����");
		}else{
			System.out.println("������ �ٸ���");
		}
	}

	String str = "������";
	void m3(){
		if(str4 == str){
			System.out.println("���� ��ü��");
		}else{
			System.out.println("�ٸ� ��ü��");
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
