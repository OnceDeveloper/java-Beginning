class CheckG 
{
	Grade g;
	CheckG(Grade g){
		this.g = g;
	}

	boolean checkNum(String[] args){
		if(args.length != 3){
			System.out.println("java Grade 점수1 점수2 점수3");
			
			return false;
		}
       
		try{
			g.a = Integer.parseInt(args[0]);
			g.b = Integer.parseInt(args[1]);
			g.c = Integer.parseInt(args[2]);
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아닌 입력값이 존재!!");
			return false;
		}

		return true;
	}
}
