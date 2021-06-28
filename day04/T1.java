class T1 
{
	void m(){
		for(int i=0; i<3; i++){
			System.out.println("i: " + i);	
		}
		//System.out.println("#i: " + i);
	}
	public static void main(String[] args) 
	{
		new T1().m();
	}
}
