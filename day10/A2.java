class A2 extends Object{
	 int m(){
		System.out.println("m");
		return 1;
	}
}
class AChild2 extends A2{
	protected int m(){//�θ��� �޼ҵ�� default���̹Ƿ� �ڽ��� default�̻��� ���� ������ �� �� �ֱ� ������
					  // public , protected, default�� �� �� �ִ�.
		System.out.println("child m");
		return -1;
	}
}

class AUser2{
	public static void main(String[] args) 
	{
		A2 a = new AChild2();
		//a.m();
		long r = a.m();//JVM�� ��ȯ�� int���� long������ �ڵ�����ȯ����
		//byte r = (byte)a.m();//��ȯ�� int���� byte���� ũ�⿡ ���� ����ȯ����
		System.out.println(r);
	}
}
