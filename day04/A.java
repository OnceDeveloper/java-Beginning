class A 
{
	String str = "��ġ"; //���
	A(int i){ //����(�Ķ����)
		double d = 1.2;  //����(�����ʱ�ȭ)
		System.out.println("A() str: " + str);
		System.out.println("A() i: " + i);
		System.out.println("A() d: " + d);	
	}
		void m(){
		System.out.println("m() str: " + str);
		//System.out.println("m() i: " + i);
		//System.out.println("m() d: " + d);
	}
	public static void main(String args[]){
		A a = new A(10);
		a.m();
	}
}

/*class AMgr
{
	public static void main(String args[]){
		A a = new A(10);
		a.m();
	}
}*/
