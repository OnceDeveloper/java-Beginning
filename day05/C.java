class C 
{
	int i = 20;
	void m1(){
		switch(i){
			case 10: System.out.println("i�� 10�̴�"); break;
			case 20: 
				System.out.println("i�� 20�̴�(1)");
				System.out.println("i�� 20�̴�(2)");
				break;
			case 30: System.out.println("i�� 30�̴�"); break;
			default: System.out.println("i�� 10 or 20 or 30�� �ƴϴ�"); 
		}
		System.out.println("switch�� ����");
	}

	void m2(){
		String str = "��ġ";
		switch(str){
			case "��α�": System.out.println("�� ��α�"); break;
			case "��ġ": System.out.println("�� ��ġ");
		}
	}
	public static void main(String[] args) 
	{
		C c = new C();
		//c.m1();
		c.m2();
	}
}
