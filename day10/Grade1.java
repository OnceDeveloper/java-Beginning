class Grade1 
{
	//1. 숫자 판단  
	int a, b, c;
	int sum, avg;
	int size;
	String grade = "F";
	Grade(String[] args){
		checkNum(args);
	}
	void checkNum(String[] args){
		if(args.length != 3){
			System.out.println("java Grade 점수1 점수2 점수3");
			
			return;
		}
        size = args.length;
       
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아닌 입력값이 존재!!");
			return;
		}

		makeAvg();
	}
	void makeAvg(){
		sum = a + b + c;
		avg = sum/size;

		makeGrade();
	}
	void makeGrade(){
		switch(avg/10){
            case 10 :
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";
		}

		showResult();
	}
	void showResult(){
		System.out.println("총점: " + sum + ", avg: " + avg + ", 학점: " + grade);
	}
	public static void main(String[] args) 
	{ 
        new Grade1(args);		
	}
}
