class A4{
	String name = "�̼���";
	int age = 10;
	
	A4(){}
	A4(String name){
		this.name = name;
	}
}

class AChild4 extends A4{

	 AChild4(){
		//super();
		System.out.println(super.name);//�̼����� �θ�
		//super("ȫ�浿");
	}

}

class AUser4{
	public static void main(String[] args) 
	{	
		A4 a = new AChild4();//AChild4���� A4�� �����ڸ� ȣ���Ͽ� "�̼���"�� ����

		System.out.println(a.name);//A4�� name�� "�̼���"�� ����
	}
}
