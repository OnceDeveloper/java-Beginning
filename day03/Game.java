 /*
	�ϻ��� � ������ ����ؼ�.. 
	���!
	�����̴� ������ ~~�� ~~������ �Ѵ�.
	Ŭ���� ���踦 �ϰ� ���(�޼ҵ�/�Ӽ�)�Ͻÿ�
*/
class Game
{
	String name = "������ġ";
	int price = 25000;

	Game(){}
	Game(String name){
		this.name = name;
	}
	Game(int price){
		this.price = price;
	}
	Game(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class Person{
	int age = 25;
	Game g1, g2, g3, g4;
	
	void play(){
		g1 = new Game();
		g2 = new Game("����");
		g3 = new Game(30000);
		g4 = new Game("�����ý��丮", 50000);
		
		System.out.println("�����̴� ������ ���εǾ� " +g1.price+"���̵� "+g1.name+"�� �����ؼ� ������ �Ѵ�.");
		System.out.println("�����̴� �߰��� �������� " +g2.price+"���� "+g2.name+"�� �����Ͽ� �����Ѵ�.");
		System.out.println("�����̴� " +g3.name+"�� "+g3.price+"���� �� ���ְ� �����Ͽ�  ������ �Ѵ�.");
		System.out.println("�����̴� " +g4.name+"�� " +g4.price+"���� ������ ��հ� ������ �Ѵ�");
	}
	void buy(Game pn){
		System.out.println("�����̴� " +pn.price+"�� " +pn.name+"��(��) �����Ѵ�");
	}
	void buy(Game pri, Game nam){
		System.out.println("�����̴� " +pri.price+"�� " +nam.name+"��(��) �����Ѵ�");
	}
} 
