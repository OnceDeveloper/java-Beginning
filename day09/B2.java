class Human2{
	String name = "È«±æµ¿";
		Human2(String name){
			this.name = name;
		}
	void move(){
		System.out.println("°È´Â´Ù");
	}
}
class SuperMan2 extends Human2{
	int power;
	SuperMan2(String name, int power){
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
class AquaMan extends Human2{
	int speed;

	AquaMan(int speed){
		super("¾ÆÄí¾Æ¸Ç");
		this.speed = speed;
	}
	void move(){
		System.out.println("Çì¾öÄ£´Ù");
	}
	void attack(){
		System.out.println("°ø°ÝÇÑ´Ù");
	}
	
}
