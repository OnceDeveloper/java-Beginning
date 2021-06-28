class BB1{

	void sup(){
		//(1) 상속
		SuperMan1 sman = new SuperMan1("아이언 맨",200);
		System.out.println("name : " +sman.name);
		System.out.println("power : " +sman.power);//SuperMan1만의 속성
		sman.move();//Human1의 move와 SuperMan1의 move 매서드명이 같은데 자식이 이겨서 '난다'가 나옴
					//Overriding , Polimorphism(다형성) => 같은 타입 객체의 동일한 메소드가 다른 일을 하는 것이다.
		sman.shotBeam();//SuperMan1만의 메서드

		//(2) 형변환
		Human1 man = sman; //Human1인 man변수가 sman보다 크기 때문에 JVM이 자동형변환해줌
		System.out.println(man.name);//name은 부모 Human1의 속성에도 있는 것이라 사용 가능
									 //But, SuperMan1에서 "아이언 맨"이 들어갔기 때문에 "아이언 맨"이 출력됨.
		//System.out.println("power : " +man.power);//power는 Human1에 없는 속성이라 오류가 뜸
		man.move();//move는 부모 Human1의 메소드에도 있는 것이라 사용 가능
  				   //But, SuperMan1에서 "난다"로 오버라이딩이 일어났기때문에 "난다"가 출력됨.
		//man.shotBeam();//shotBeam은 Human1에 없는 메소드라 오류가 뜸
		
		//////////////////////////배열 or컬렉션에 저장/////////////////////////
		//sman의 기능을 다시 가져오기 위해서 Human1의 변수인 man을 강제형변환해준다.
		SuperMan1 ssman = (SuperMan1)man;
		System.out.println("ssman.name: " + ssman.name);
		System.out.println("ssman.name: " + ssman.power);//SuperMan1의 기능을 다시 쓸 수 있게 되었다.
		ssman.move();//'난다'출력됨
		ssman.shotBeam();		
	}
	
	void pep(){
		PepsiMan1 pman = new PepsiMan1(300);
		System.out.println("pman.name: " + pman.name);//"펩시맨"이 나온다.
		System.out.println("pman.name: " + pman.speed);
		pman.move();//overriding 함

		//<형변환 시도>//
		//SuperMan1 sman = pman; //형제 관계라 형변환 불가
	}
	void bolga(){
		SuperMan1 sman = (SuperMan1)new Human1("이순신");//sman이 Human보다 작기때문에 아작이 남 
		//System.out.println("sman.name: " + sman.name);//그러므로 컴파일은 가능 실행은 불가능!
	}

	public static void main(String[] args) 
	{
		BB1 bb = new BB1();
		//bb.sup();
		//bb.pep();
		bb.bolga();
	}
}
