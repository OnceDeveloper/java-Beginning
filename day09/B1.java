class Human1 extends Object{
	String name = "ȫ�浿";
	Human1(String name){
		this.name = name;
	}
	void move(){
		System.out.println("�ȴ´�.");
	}
}
class SuperMan1 extends Human1{
	int power;
	SuperMan1(){
		super("���۸�");
	}
	SuperMan1(String name, int power){
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
class PepsiMan1 extends Human1{
	int speed;

	PepsiMan1(int speed){
		super("��ø�");
		this.speed = speed;
	}
	void move(){
		System.out.println("�޸���");
	}
}
