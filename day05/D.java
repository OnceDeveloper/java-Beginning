class D 
{
	void m1(){ //신사 
		int i = 0; //초기식 
		while(i<5) { //조건식 
			System.out.println("i: " + i);
			i++; //증감식
		}
		
		System.out.println("루프를 나옴");
	}
	void m2(){ //조폭
		int i = 5; //초기식 
		do{
			System.out.println("i: " + i);
			i++;
		}while(i<5); //조건식  

		System.out.println("루프를 나옴");
	}
	void m3(){
		for(int i=0; i<5 ;i++) 
			System.out.println("i: " + i); 
		
		System.out.println("루프를 나옴");
	}
	public static void main(String[] args) 
	{
		D d = new D();
		//d.m1();
		d.m2();
		//d.m3();
	}
}


