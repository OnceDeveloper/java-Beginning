class B1{
	//�����ε�
	B1(){
	}
	B1(String name){
	}

	//�����ε�
	void m(){
	}
	/*int m(int i){
		System.out.println("m(int i)");
		return i;
	}*/
	byte m(byte b){
		System.out.println("m(byte b)");
		return b;
	}
}

class BUser1 
{
	public static void main(String[] args) 
	{
		B1 b = new B1();
		int val = 10;
		b.m((byte)val);//byte m�� ȣ��ȴ�. val�� int���̹Ƿ� byte������ ��������ȯ������Ѵ�.
	}
}
