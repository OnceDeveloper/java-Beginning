class B 
{
	//오버로딩
	B(){
	}
	B(String name){  
	}

    //오버로딩
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
		B b = new B("이순신");
		byte val = 10;
		b.m(val);
	}
}

