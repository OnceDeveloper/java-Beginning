class BB2{
	int a;
	Human2 man;
	SuperMan2 sman = new SuperMan2("캡틴",300);

	void spergo(){
		a=10;
		System.out.print("super name : "+sman.name + " super power : " +sman.power+"파워로 ");
		sman.move();
		System.out.print(sman.power+"파워로 ");
		sman.shotBeam();
	}
	void byun1(){//(1)형변환 메소드 - 자동 형변환
		BB2 b = new BB2();
		//b.spergo();
		man = b.sman;
		System.out.println(man.name);
		man.move();
	}
	
	void byun2(){//(2)형변환 메소드 - 강제 형변환
		BB2 b = new BB2();
		b.byun1();
		SuperMan2 ssman = (SuperMan2)b.man;
		System.out.println(ssman.power);
	}

	
	void aquago(){
		AquaMan aman = new AquaMan(500);
		System.out.print("name : "+aman.name + " power : " +aman.speed+"스피드로 ");
		aman.move();
		System.out.print(+aman.speed+"스피드로 ");
		aman.attack();
	}
	

	public static void main(String[] args) 
	{
		BB2 bb = new BB2();
		//bb.spergo();
		//bb.aquago();
		bb.byun1();
		bb.byun2();
	}
}
