class A 
{
	String str0 = "��";
	String str1 = "����";
	String str2 = "����";
	String str3 = "�ܿ�";

    //String items[]; //(1)���� 
	String items[] = new String[4]; //���� �� ���� 
	void in(){
		//items = new String[4]; //(2)���� 
		items[0] = str0; //(3)�ʱ�ȭ 
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
