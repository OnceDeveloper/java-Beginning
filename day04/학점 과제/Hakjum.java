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

		System.out.println("���� : "+ sum);
		System.out.println("��� : "+ avg);

		if(avg>=90){
			System.out.println("A���� �Դϴ�");
		}else if(avg>=80){
			System.out.println("B���� �Դϴ�");
		}else if(avg>=70){
			System.out.println("C���� �Դϴ�");
		}else if(avg>=60){
			System.out.println("D���� �Դϴ�");
		}else {
			System.out.println("F���� �Դϴ�");
		}

	}

}
