class A3{
	static String str = "�ȳ�";
	A3(){}
	void m(){
		System.out.println(str+1);
	}
}

class AUser3{
	public static void main(String[] args) 
	{
		System.out.println(A3.str);
		new A3().m();//m()�� static�� �ƴ϶� ��ü�� ���� �� ȣ������� ��
	}
}
