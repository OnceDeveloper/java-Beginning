class D 
{
	void m1(){ //�Ż� 
		int i = 0; //�ʱ�� 
		while(i<5) { //���ǽ� 
			System.out.println("i: " + i);
			i++; //������
		}
		
		System.out.println("������ ����");
	}
	void m2(){ //����
		int i = 5; //�ʱ�� 
		do{
			System.out.println("i: " + i);
			i++;
		}while(i<5); //���ǽ�  

		System.out.println("������ ����");
	}
	void m3(){
		for(int i=0; i<5 ;i++) 
			System.out.println("i: " + i); 
		
		System.out.println("������ ����");
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		d.m2();
		//d.m3();
	}
}


