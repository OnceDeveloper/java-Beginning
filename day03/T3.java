class T3 
{
	void m1(){
		System.out.println("������ ������1");
	}
	������ m2(){
		System.out.println("������ ������2 and �ܾ��� ������");
		return new ������("��ü��", 2000);
	}
	public static void main(String[] args) 
	{
		T3 t = new T3();
		t.m1();
	    ������ rep = t.m2();
	    System.out.println("�ݾ�: " + rep.�ݾ�);
		System.out.println("��ȣ: " + rep.��ȣ);
	}
}
class ������ 
{
	String ��ȣ;
	long �ݾ�;
	
	������(String ��ȣ, long �ݾ�){
	   this.��ȣ = ��ȣ;
       this.�ݾ� = �ݾ�;
	}
}
