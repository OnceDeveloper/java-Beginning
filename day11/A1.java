class A1{//static class A1�� �Ұ���!! A1Ŭ������ Ŭ���� �����ٴ� ���� �ȵ�
	static int i = 10;
	A1(){}//�����ڵ� static�� �Ұ���
	static void m(){
		System.out.println("A�� m()");
		i++;
		System.out.println(i);
	}
	void m1(){
		System.out.println("A�� m1()");
		System.out.println(i);
	}
	public static void main(String args[]){	
		System.out.println(i);
		m();
		
	}
	
}
class AUser1{
	public static void main(String[] args){
		System.out.println(A1.i);
		A1.m();
	}
}
