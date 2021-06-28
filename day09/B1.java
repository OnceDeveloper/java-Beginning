class Human1 extends Object{
	String name = "È«±æµ¿";
	Human1(String name){
		this.name = name;
	}
	void move(){
		System.out.println("°È´Â´Ù.");
	}
}
class SuperMan1 extends Human1{
	int power;
	SuperMan1(){
		super("½´ÆÛ¸Ç");
	}
	SuperMan1(String name, int power){
		super(name);
		this.power = power;
	}
	void move(){
		System.out.println("³­´Ù");
	}
	void shotBeam(){
		System.out.println("±¤¼±À» ½ð´Ù");
	}
}
class PepsiMan1 extends Human1{
	int speed;

	PepsiMan1(int speed){
		super("Æé½Ã¸Ç");
		this.speed = speed;
	}
	void move(){
		System.out.println("´Þ¸°´Ù");
	}
}
