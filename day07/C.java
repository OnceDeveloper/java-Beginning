class C 
{
	int is[] = {10, 20, 30}; //���� ���� �ʱ�ȭ 
	void out(){
		for(int i=0; i<is.length; i++){
			System.out.println("is["+i+"]: " + is[i]);
		}
	}
	public static void main(String args[]) {
		C c = new C();
		c.out();
	}
}
