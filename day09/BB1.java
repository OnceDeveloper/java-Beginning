class BB1{

	void sup(){
		//(1) ���
		SuperMan1 sman = new SuperMan1("���̾� ��",200);
		System.out.println("name : " +sman.name);
		System.out.println("power : " +sman.power);//SuperMan1���� �Ӽ�
		sman.move();//Human1�� move�� SuperMan1�� move �ż������ ������ �ڽ��� �̰ܼ� '����'�� ����
					//Overriding , Polimorphism(������) => ���� Ÿ�� ��ü�� ������ �޼ҵ尡 �ٸ� ���� �ϴ� ���̴�.
		sman.shotBeam();//SuperMan1���� �޼���

		//(2) ����ȯ
		Human1 man = sman; //Human1�� man������ sman���� ũ�� ������ JVM�� �ڵ�����ȯ����
		System.out.println(man.name);//name�� �θ� Human1�� �Ӽ����� �ִ� ���̶� ��� ����
									 //But, SuperMan1���� "���̾� ��"�� ���� ������ "���̾� ��"�� ��µ�.
		//System.out.println("power : " +man.power);//power�� Human1�� ���� �Ӽ��̶� ������ ��
		man.move();//move�� �θ� Human1�� �޼ҵ忡�� �ִ� ���̶� ��� ����
  				   //But, SuperMan1���� "����"�� �������̵��� �Ͼ�⶧���� "����"�� ��µ�.
		//man.shotBeam();//shotBeam�� Human1�� ���� �޼ҵ�� ������ ��
		
		//////////////////////////�迭 or�÷��ǿ� ����/////////////////////////
		//sman�� ����� �ٽ� �������� ���ؼ� Human1�� ������ man�� ��������ȯ���ش�.
		SuperMan1 ssman = (SuperMan1)man;
		System.out.println("ssman.name: " + ssman.name);
		System.out.println("ssman.name: " + ssman.power);//SuperMan1�� ����� �ٽ� �� �� �ְ� �Ǿ���.
		ssman.move();//'����'��µ�
		ssman.shotBeam();		
	}
	
	void pep(){
		PepsiMan1 pman = new PepsiMan1(300);
		System.out.println("pman.name: " + pman.name);//"��ø�"�� ���´�.
		System.out.println("pman.name: " + pman.speed);
		pman.move();//overriding ��

		//<����ȯ �õ�>//
		//SuperMan1 sman = pman; //���� ����� ����ȯ �Ұ�
	}
	void bolga(){
		SuperMan1 sman = (SuperMan1)new Human1("�̼���");//sman�� Human���� �۱⶧���� ������ �� 
		//System.out.println("sman.name: " + sman.name);//�׷��Ƿ� �������� ���� ������ �Ұ���!
	}

	public static void main(String[] args) 
	{
		BB1 bb = new BB1();
		//bb.sup();
		//bb.pep();
		bb.bolga();
	}
}
