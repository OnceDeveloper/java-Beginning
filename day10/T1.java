class T1 
{
	private String str = "����"; //���� �Ұ� 
	private void m(){ //���� �Ұ�
		System.out.println("m()");
	}
}
class T1Child extends T1
{
	public static void main(String args[]){
		T1Child t = new T1Child();
		//System.out.println("t.str: " + t.str);
		//t.m();
	}
}
