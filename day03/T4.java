class T4 {
	String �Ӳ�;
    int ����;
	/*T4(){
		�Ӳ� = "����";
		���� = 1000;
	}*/
	T4(String �Ӳ�, int ����){
		this.�Ӳ� = �Ӳ�;
		this.���� = ����;
	}

	public static void main(String[] args) 
	{
		T4 t = new T4("�����Ӳ�", 1200);
		System.out.println("�Ӳ�: " + t.�Ӳ�);
		System.out.println("����: " + t.����);
	}
}
