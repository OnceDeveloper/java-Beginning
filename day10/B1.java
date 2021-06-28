class B1{
	//오버로딩
	B1(){
	}
	B1(String name){
	}

	//오버로딩
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
		b.m((byte)val);//byte m이 호출된다. val은 int형이므로 byte형으로 강제형변환해줘야한다.
	}
}
