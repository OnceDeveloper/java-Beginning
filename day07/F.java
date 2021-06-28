class F 
{
	int is1[] = {1, 2};
	int is2[] = {30};
	int iss[][] = {is1, is2, {400, 500, 600, 700, 800}, {900, 1000}};

    void out(){
		/*System.out.println("iss[0][0]: " + iss[0][0]);
		System.out.println("iss[0][1]: " + iss[0][1]);
		System.out.println("iss[1][0]: " + iss[1][0]);
		System.out.println("iss[1][1]: " + iss[1][1]);*/

		for(int i=0; i<iss.length; i++){
			for(int j=0; j<iss[i].length; j++){
				System.out.println("iss["+i+"]["+j+"]: " + iss[i][j]);
			}
		}
	}
	public static void main(String[] args) 
	{
		new F().out();
	}
}
