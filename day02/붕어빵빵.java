class �ؾ��{
	String �Ӳ�="��";
	int ����=300;
	�ؾ��(){}
	�ؾ��(String �Ӳ�){
		this.�Ӳ� = �Ӳ�;
	}
	�ؾ��(int ����){
		this.���� = ����;
	}
	�ؾ��(String �Ӳ�, int ����){
		this.�Ӳ� = �Ӳ�;
		this.���� = ����;
	}
}

class ���ָӴ�{
	int age = 50;
	�ؾ�� ��1,��2,��3,��4;

	

	void ���´�(){
		��1 = new �ؾ��();
		��2 = new �ؾ��("����");
		��3 = new �ؾ��(500);
		��4 = new �ؾ��("������", 1000);

		System.out.println("�Ӳ��� " + ��1.�Ӳ� + "�̰�, ������ " + ��1.���� + "�� �ؾ�� ��������.");
		System.out.println("�Ӳ��� " + ��2.�Ӳ� + "�̰�, ������ " + ��2.���� + "�� �ؾ�� ��������.");
		System.out.println("�Ӳ��� " + ��3.�Ӳ� + "�̰�, ������ " + ��3.���� + "�� �ؾ�� ��������.");
		System.out.println("�Ӳ��� " + ��4.�Ӳ� + "�̰�, ������ " + ��4.���� + "�� �ؾ�� ��������.");
	}
	void �Ǹ��Ѵ�(�ؾ�� ��){
		System.out.println("���̿��� ������ " + ��.���� + "�� �ؾ�� �Ǹ��ߴ�.");
	}
}
