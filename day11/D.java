abstract class D //�߻�Ŭ���� 
{
	//abstract int i; //�ȵ�!
	//abstract D(); //�ȵ�! 

	int j = 10;
	abstract void m(); //�߻�޼ҵ� 
	void m2(){ //�Ϲݸ޼ҵ�
		System.out.println("D�� m2()");
	}
}
class DChild extends D {
	void m(){ //�������̵� 
		System.out.println("DChild�� m()");
	}
}

class DUser
{
	public static void main(String args[]){
		//�߻�Ŭ���� D�� ��ü�� ����ÿ�
		D d = new DChild();

		System.out.println("d.j: " + d.j);
		d.m();
		d.m2();
	}
}
