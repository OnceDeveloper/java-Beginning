class A1 extends Object{
	int m(){
		System.out.println("A1�� m()");
		return 1;
	}
}
class AChild1 extends A1{
	public int m(){
		System.out.println("AChild1 m()");
		return -1;
	}
}
class AUser1{
	public static void main(String[] args){
		A1 a = new AChild1();
		int r = a.m();//AChild���� �������̵��Ǿ� -1�� ��µȴ�.
		System.out.println("r : " +r);
	}
}

/*
���� ������(���� ���� ->���� ����)
public -> protected -> default -> private
�������̵� �� �ڽ��� ���������ڰ� �θ� ������������ ���� �����̻��϶��� ������ �����ϴ�
*/