class Human2{
	String name = "ȫ�浿";
		Human2(String name){
			this.name = name;
		}
	void move(){
		System.out.println("�ȴ´�");
	}
}
class SuperMan2 extends Human2{
	int power;
	SuperMan2(String name, int power){
		super(name);
		this.power = power;
	}
	void move(){
		System.out.println("����");
	}
	void shotBeam(){
		System.out.println("������ ���");
	}
}
class AquaMan extends Human2{
	int speed;

	AquaMan(int speed){
		super("����Ƹ�");
		this.speed = speed;
	}
	void move(){
		System.out.println("���ģ��");
	}
	void attack(){
		System.out.println("�����Ѵ�");
	}
	
}
