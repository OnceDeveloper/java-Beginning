class BB 
{
	void m1(){
		//(1) ��� 
		SuperMan sman = new SuperMan("������", 200);
        /*System.out.println("sman.name: " + sman.name); //�θ�
		System.out.println("sman.power: " + sman.power); //�ڱ� 
		sman.move(); //�θ�
		sman.shotBeam(); //�ڱ� 
		*/
		System.out.println("sman: " + sman.toString());

		//(2) ����ȯ 
		Human man = sman; //�ڵ�����ȯ 
        System.out.println("man.name: " + man.name); //�θ�
		//System.out.println("man.power: " + man.power); //�ڱ� 
		man.move(); //�θ�
		//man.shotBeam(); //�ڱ�  
     
	    ////////////////////////// �迭or�÷��ǿ� ���� ////////////////

		SuperMan ssman = (SuperMan)man;
		System.out.println("ssman.name: " + ssman.name); //�θ�
		System.out.println("ssman.power: " + ssman.power); //�ڱ� 
		ssman.move(); //�θ�
		ssman.shotBeam();
	}
	void m2(){
		PepsiMan pman = new PepsiMan(500);
		System.out.println("pman.name: " + pman.name); //�θ�
		System.out.println("pman.speed: " + pman.speed); //�θ�
		pman.move(); //�θ�

        //����ȯ �õ�
        //SuperMan sman = pman; //�������� ����ȯ �Ұ� 
	}
	void m3(){ 
		SuperMan sman = (SuperMan)new Human("�̼���");
		System.out.println("sman.name: " + sman.name);
	}
	public static void main(String[] args) 
	{
		BB bb = new BB();
		bb.m1();
		//bb.m2();
		//bb.m3();
	}
}
