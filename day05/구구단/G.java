class G 
{
	void m1(){ //반복문 사용하지 않음 
		System.out.println("2 * 1 =  2");
		System.out.println("2 * 2 =  4");
		System.out.println("2 * 3 =  6");
		System.out.println("2 * 4 =  8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		System.out.println("2 * 7 = 14");
		System.out.println("2 * 8 = 16");
		System.out.println("2 * 9 = 18");
	}
	void m2(){ //2단 
		int i;
		int j;
		int gop;
		//2*1=2
		for(i=2;i<=2;i++){
			for(j=1;j<=9;j++){
				gop = i*j;
				System.out.println(i +"*"+ j +" = "+ gop);
			}
			//System.out.println();
		}
	}
	
	void m3(){ //구구단 
		int i;
		int j;
		int gop;
		//2*1=2
		for(i=2;i<=9;i++){
			for(j=1;j<=9;j++){
				gop = i*j;
				System.out.print(i +"*"+ j +" = "+ gop + "\t");
			}
			System.out.println();
		}
	}
	void m4(){ //구구구단 
		int i;
		int j;
		int k;
		int gop;
		//2*1*1=2
		//2*1*2=2
		for(i=2;i<=9;i++){
			for(j=1;j<=9;j++){
				for(k=1;k<=9;k++){
				gop = i*j*k;
				System.out.println(i +"*"+ j +"*"+ k +" = "+ gop);
				}
				System.out.println();
			}
			//System.out.println();
		}
	}

	void m5(){//while 구구구단
		int i;
		int j;
		int k;
		int gop=0;
		//2*1=2
		//2*2=4
		//
		i=2;
		while(i<=9){
			j=1;
			while(j<=9){
				k=1;
				if(i<=9){
						  System.out.println("=============시작=============");
						  System.out.println("\t    "+i+"*"+j+"*"+k+"\t    ");
						  System.out.println("==============================");
						  }
				while(k<=9){
				gop = i * j * k;
				System.out.println(i+"*"+j+"*"+k+"="+gop);
				k++;
				}
				 /*if(i<=8){
						  System.out.println("=============시작=============");
						  System.out.println("\t    "+i+"*"+(j+1)+"*"+(k-9)+"\t    ");
						  System.out.println("==============================");
						  }*/
			j++;
			}//System.out.println("///"+i+"*"+(j-1)+"*"+(k-1)+"///");
		i++;
		}

	}

	public static void main(String[] args) 
	{
		G g = new G();
		//g.m1();
		//g.m2();
		//g.m3();
		//g.m4();
		g.m5();
	}
}
