abstract class D1{//�߻� Ŭ���� , �߻� �޼ҵ尡 �ϳ��� �ִٸ� abstract�� �� �ٿ��� ��!
	
	//abstract int i;//�ȵ�
	//abstract D();//�ȵ�
	
	int j = 10;
	abstract void m1();//�߻� �޼ҵ�� �ٵ� �����ؾ���
	abstract void m2();
	void m3(){
		System.out.println("D1�� m3() �Ϲݸ޼ҵ�");
	}
}

class DChild1 extends D1{
	void m1(){
		//System.out.println("����");
	}
	void m2(){
				//System.out.println("����1");
	}
}
class DUser1{
	public static void main(String[] args) 
	{
		D1 d = new DChild1();

		System.out.println("d.j : " +d.j);
		d.m1();
		d.m2();
		d.m3();
	}
}