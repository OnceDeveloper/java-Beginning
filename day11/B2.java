class B2{
	
	static int i;
	int j;

	void m(){
		i++;
		j++;
	}

	public static void main(String[] args) 
	{
		B2 b1 = new B2();//i�� �ϳ� / j�� �ϳ�(1)
		B2 b2 = new B2();//i�� �״��(��1��) / j�� �ϳ�(��2��)

		b1.m();
		b2.m();
		
		System.out.println("b1.i: "+b1.i + ", b1.j : " +b1.j);
		System.out.println("b2.i: "+b2.i + ", b2.j : " +b2.j);
		System.out.println("B.i: "+B2.i);
		//i�� Ŭ���� �Ҽ��̶� �� �� ���� �������!!
		//j�� ��ü �Ҽ��̶� �����Ҷ����� ��� �������!!
		//�� 2�������߱� ������ i�� 1�� j�� 2���� �����������!
		//b1�� i�� b2�� i�� ���� ���̰�, b1�� j�� b2�� j�� �ٸ� ����.
	}
}
