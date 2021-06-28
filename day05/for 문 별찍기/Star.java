class Star {
	String str1 = "  ";
	String str2 = "* ";

	
	void m2(){
/*
        *
		* *
		* * *
		* * * *
*/		
		int i;
		int j;
		for(i=0;i<4;i++){// 0 // 1
			for(j=0;j<=i;j++){//0 <= 0  //  0 <= 1 // 1
				System.out.print(str2);
			}System.out.println("");
		}
	}

	void m3(){
/*
              *
			* *
		  * * *
		* * * *
*/
		int i;
		int j;
		int k;
		
	
	}
	void m4(){

/*
        * * * *
		* * *
		* *
		*
*/
		
	}
	void m5(){
/*
		* * * *
		  * * *
			* *
			  *    
*/
		

	}

	public static void main(String[] args) {
		Star h = new Star();
		
		h.m2();
		System.out.println("");
		//h.m3();
		//System.out.println("");
		//h.m4();
		//System.out.println("");
		//h.m5();

	}
}
