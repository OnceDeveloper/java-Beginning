class T1 
{
	String items[] = {"��", "����", "����", "�ܿ�"};
	void m1(){ //���� 
		for(int i=0; i<4; i++){
			//if(!items[i].equals("����"))
			if(i != 2)
			System.out.println("items["+i+"] : " + items[i]);
		}
	}
	void m2(){ //���� 
		int cnt = 0;
		for(String item : items){
			if(cnt++ != 2)
				System.out.println("item : " + item);
		}
	}
	public static void main(String[] args) 
	{
		T1 t = new T1();
		//t.m1();
		t.m2();
		
	}
}
