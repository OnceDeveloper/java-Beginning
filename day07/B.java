class B 
{
	String str0 = "��";
	String str1 = "����";
	String str2 = "����";
	String str3 = "�ܿ�";

    String items[] = {str0, str1, str2, str3}; //���� �� ���� �� �ʱ�ȭ
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
