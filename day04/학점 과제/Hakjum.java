class Hakjum {
	public static void main(String[] args) 
	{
		Jum jumsu = new Jum();
		jumsu.in_1();
		jumsu.in_2();
		jumsu.in_3();
		jumsu.in_4();
		jumsu.in_5();
		
		int sum;
		int avg;
		
		sum = jumsu.kor+jumsu.eng+jumsu.mat+jumsu.soc+jumsu.sci;
		avg = sum/5;

		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ avg);

		if(avg>=90){
			System.out.println("A학점 입니다");
		}else if(avg>=80){
			System.out.println("B학점 입니다");
		}else if(avg>=70){
			System.out.println("C학점 입니다");
		}else if(avg>=60){
			System.out.println("D학점 입니다");
		}else {
			System.out.println("F학점 입니다");
		}

	}

}
