class Grade 
{ 
	int a, b, c;
	int sum, avg;
	int size;
	String grade = "F";

	Grade(String[] args){
		CheckG cg = new CheckG(this);
		if(cg.checkNum(args)){
			System.out.println("(1) a:"+a + ", b: "+ b + ", c: "+c);
			size = args.length;
		}

		MakeG mg = new MakeG(this);
		mg.makeAvg();
	}
	void showResult(){
		System.out.println("ÃÑÁ¡: " + sum + ", avg: " + avg + ", ÇÐÁ¡: " + grade);
	}

	public static void main(String[] args) 
	{ 
        new Grade(args);		
	}
}
