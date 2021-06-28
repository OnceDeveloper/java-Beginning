class BB 
{
	void m1(){
		//(1) 상속 
		SuperMan sman = new SuperMan("조건희", 200);
        /*System.out.println("sman.name: " + sman.name); //부모
		System.out.println("sman.power: " + sman.power); //자기 
		sman.move(); //부모
		sman.shotBeam(); //자기 
		*/
		System.out.println("sman: " + sman.toString());

		//(2) 형변환 
		Human man = sman; //자동형변환 
        System.out.println("man.name: " + man.name); //부모
		//System.out.println("man.power: " + man.power); //자기 
		man.move(); //부모
		//man.shotBeam(); //자기  
     
	    ////////////////////////// 배열or컬렉션에 저장 ////////////////

		SuperMan ssman = (SuperMan)man;
		System.out.println("ssman.name: " + ssman.name); //부모
		System.out.println("ssman.power: " + ssman.power); //자기 
		ssman.move(); //부모
		ssman.shotBeam();
	}
	void m2(){
		PepsiMan pman = new PepsiMan(500);
		System.out.println("pman.name: " + pman.name); //부모
		System.out.println("pman.speed: " + pman.speed); //부모
		pman.move(); //부모

        //형변환 시도
        //SuperMan sman = pman; //형제관계 형변환 불가 
	}
	void m3(){ 
		SuperMan sman = (SuperMan)new Human("이순신");
		System.out.println("sman.name: " + sman.name);
	}
	public static void main(String[] args) 
	{
		BB bb = new BB();
		bb.m1();
		//bb.m2();
		//bb.m3();
	}
}
