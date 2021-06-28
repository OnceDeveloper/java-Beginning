class H {
	String str1 = "  ";
	String str2 = "* ";

	void m1(){
		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.println();

		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.println();

		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.println();

		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.print(str2);
		System.out.println();
	}
	void m11(){
		for(int j=0; j<4; j++){
			for(int i=0; i<4; i++){
				System.out.print(str2);
			}
			System.out.println();
		}
	}
	void m2(){
/*
        *
		* *
		* * *
		* * * *
*/		
		int i;
		int j;

		for(i=0; i<4; i++){
			for(j=0; j<=i ; j++){
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
		for(i=0;i<4;i++){//i=0이고//i=1이고//i=2//i=3
			for(j=3;j>i;j--){
				System.out.print(str1);// str2==별 / str1 ==공백
			}
			for(k=0;k<=i;k++){
				System.out.print(str2);
			}System.out.println("");
		}
	
	}
	void m4(){

/*
        * * * *
		* * *
		* *
		*
*/
		int i;
		int j;
		for(i=0;i<4;i++){//i=0이고//i=1이고//i=2//i=3
			for(j=4;j>i;j--){//j=4이고 j>i == 4>0 true니까 별을 4번 찍음/////j=3이고 j>i == 3>1 true
				System.out.print(str2);
			}System.out.println("");
		}
	}
	void m5(){
/*
		* * * *
		  * * *
			* *
			  *    
*/
		int i;
		int j;
		int k;
		for(i=0;i<4;i++){//i=0이고//i=1이고//i=2//i=3
			for(k=0;k<i;k++){
				System.out.print(str1);
			}
			for(j=4;j>i;j--){//j=4이고 j>i == 4>0 true니까 별을 4번 찍음/////j=3이고 j>i == 3>1 true
				System.out.print(str2);// str2==별 / str1 ==공백
			}System.out.println("");
		}

	}

	public static void main(String[] args) {
		H h = new H();
		//h.m1();
		//h.m11();
		h.m2();
		System.out.println("");
		h.m3();
		System.out.println("");
		h.m4();
		System.out.println("");
		h.m5();

	}
}
