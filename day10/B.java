class B 
{
	//�����ε�
	B(){
	}
	B(String name){  
	}

    //�����ε�
	void m(){
	}
	int m(int i){
		System.out.println("m(int i)");
		return i;
	}
	byte m(byte b){
		System.out.println("m(byte b)");
		return b;
	}
}

class BUser
{
	public static void main(String[] args) 
	{
		B b = new B("�̼���");
		byte val = 10;
		b.m(val);
	}
}

