class D {
	String name = "�̼���";
    D(){}
	D(String name){
		this.name = name;
	}
	void m(){
		System.out.println("D�� m()");
	}
}
class DChild extends D {
	String name = "ȫ�浿";
	DChild(){
		//super(name); //(1) �θ��� ������
	}
	void m(){ //�������̵�
		System.out.println("DChild�� m()");
	}
	void old(){
		super.m(); //(2) �������̵����� �θ�޼ҵ� ȣ��
		System.out.println("super.name: " + super.name); //(3) �̸��� ���� �θ����� �ڽĿ��� ȣ���� �� 
	}
}


class DUser {
	public static void main(String[] args) {
		DChild d = new DChild();
		d.old();
	}
}