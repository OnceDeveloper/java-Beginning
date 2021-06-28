class E 
{
	byte b = 10;
	short s = 20;
	char c = 'A';
	int i = 40;
	float f = 50.4f;

    int is[] = {b, s, c, i, (int)f};

	void out(){
		for(int i=0; i<is.length; i++){
			System.out.println("is["+i+"]: " + is[i]); //int 
		}
	}
	public static void main(String[] args) 
	{
		E e = new E();
		e.out();
	}
}
