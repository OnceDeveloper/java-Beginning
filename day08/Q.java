class Q {

	int a[] = {1,2,3,4,5};
	int b[] = {10,20,30,40,50};

	void m1(){
		for(int i=0; i<5; i++){
			a[i] = b[i];
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		Q q = new Q();
		q.m1();
	}
}
