class B1{
	
	int i;//��ü�Ҽ�
	static int j;//Ŭ���� �Ҽ�

	void m(){
		i++;
		j++;
	}

	public static void main(String[] args) 
	{
		B1 b1 = new B1();//i �ϳ� j�ϳ�
		B1 b2 = new B1();//i �ϳ� j�״��
		B1 b3 = new B1();//i �ϳ� j�״��
						 // �� i�� 2�� ������� j�� 1����
		b1.m();//b1�� i�� ++�� / j�� ++�� -> i : 1 , j : 1
		b2.m();//b2�� i�� ++�� / j�� ++�� -> i : 1 , j : 2
		b3.m();//b2�� i�� ++�� / j�� ++�� -> i : 1 , j : 3

		System.out.println("b1.i : " +b1.i);//b1�� i�� 1�̱⿡ 1�� ��µ�
		System.out.println("b2.i : " +b2.i);//b2�� i�� 1�̱⿡ 1�� ��µ�
		System.out.println();
		System.out.println("b1.j : "+b1.j);
		System.out.println("b2.j : "+b2.j);
		System.out.println("B1.j : "+B1.j);
		System.out.println("j : "+j);

		
	}
}
