class B 
{
	B(){}
	void m1(){
		int i=11;
		if(i>10){
			BB.m2();//m2()�� static�� �پ Ŭ�����Ҽ� �����̱⿡
					//���� ��ü�� ���� �������� �ʰ� ȣ���� �����ϴ�.
			//new BB().m2(); ��ü�� �����ϰ� ȣ���ϴ� ����̴�.
		}else if(i<10){
			System.out.println("i�� 10���� �۴�");
		}else{
			System.out.println("i�� 10�̴�");
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.B();
		b.m1();
	}
}
