class MakeG 
{
	Grade g;
	MakeG(Grade g){
		this.g = g;
	}
	void makeAvg(){
		g.sum = g.a + g.b + g.c;
		g.avg = g.sum/g.size;

		makeGrade();
	}
	private void makeGrade(){
		switch(g.avg/10){
            case 10:
			case 9: g.grade = "A"; break;
			case 8: g.grade = "B"; break;
			case 7: g.grade = "C"; break;
			case 6: g.grade = "D"; break;
			default: g.grade = "F";
		}

		g.showResult();
	}
}
