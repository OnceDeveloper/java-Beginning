class CheckG 
{
	Grade g;
	CheckG(Grade g){
		this.g = g;
	}

	boolean checkNum(String[] args){
		if(args.length != 3){
			System.out.println("java Grade ����1 ����2 ����3");
			
			return false;
		}
       
		try{
			g.a = Integer.parseInt(args[0]);
			g.b = Integer.parseInt(args[1]);
			g.c = Integer.parseInt(args[2]);
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴ� �Է°��� ����!!");
			return false;
		}

		return true;
	}
}
