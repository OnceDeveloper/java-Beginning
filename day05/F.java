class F 
{
	void tip(){
		int i = 5/2;
		System.out.println("i: " + i);

		int j = 5%2;
		System.out.println("j: " + j);
	}
	void m1(){ //1~100 ÇÕ 
		int i=1;
		int sum=0;
		int r = 0;
		r = 1+2+3+4+5+6+7+8+9+10;
		//1+2+3+4+5+6+7
		for(;i<=100;i++){
			sum+=i;
			//sum = sum+i
			// 0 = 1
			// 1 = 1+2
			// 3 = 3+3
			// 6 = 6+4
			// 10 = 10+5
		}
		System.out.println("1~10±îÁöÀÇ ÇÕ r: " + r);
		System.out.println("1~100±îÁöÀÇ ÇÕ sum: " + sum);
	}
	void m2(){ //1~78456456 ÇÕ 
		int i=1;
		long sum=0;
		
		for(;i<=78456456;i++){
			sum +=i;
			//sum = sum+i
			// 0 = 1
			// 1 = 1+2
			// 3 = 3+3
			// 6 = 6+4
			// 10 = 10+5
		}
		System.out.println("1~78456456±îÁöÀÇ ÇÕ sum: " + sum);
	}

	void m3(){
		System.out.println("1~100±îÁöÀÇ ÇÕ sum: " +101*50);
	}

	void m4(){
		int i;
		int Â¦=0;
		int È¦=0;
		int r;
		//Â¦ = 2+4+6+8+10=30
		//È¦ = 1+3+5+7+9=25

		for(i=1;i<=100;i++){	
			if(i % 2 ==0)
				Â¦ += i;
			else
				È¦ += i;
		}
		r = Â¦+È¦;
		System.out.println("1~100±îÁöÀÇ Â¦¼öÀÇ ÇÕ Â¦: "+ Â¦);
		System.out.println("1~100±îÁöÀÇ È¦¼öÀÇ ÇÕ È¦: "+ È¦);
		System.out.println("1~100±îÁöÀÇ ÃÑ ÇÕ: "+ r);
	}

	public static void main(String[] args) 
	{
		F f = new F();
		//f.tip();
		//f.m1();
		//f.m2();
		//f.m3();
		f.m4();
	}
}
