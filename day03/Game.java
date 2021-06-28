 /*
	일상의 어떤 현상을 상상해서.. 
	사람!
	혜원이는 가격이 ~~인 ~~게임을 한다.
	클래스 설계를 하고 출력(메소드/속성)하시오
*/
class Game
{
	String name = "오버워치";
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
		g2 = new Game("동숲");
		g3 = new Game(30000);
		g4 = new Game("메이플스토리", 50000);
		
		System.out.println("혜원이는 가격이 할인되어 " +g1.price+"원이된 "+g1.name+"를 구매해서 게임을 한다.");
		System.out.println("혜원이는 중고나라 가격으로 " +g2.price+"원인 "+g2.name+"을 구매하여 게임한다.");
		System.out.println("혜원이는 " +g3.name+"를 "+g3.price+"원에 제 값주고 구매하여  게임을 한다.");
		System.out.println("혜원이는 " +g4.name+"에 " +g4.price+"원을 현질해 재밌게 게임을 한다");
	}
	void buy(Game pn){
		System.out.println("혜원이는 " +pn.price+"인 " +pn.name+"을(를) 구매한다");
	}
	void buy(Game pri, Game nam){
		System.out.println("혜원이는 " +pri.price+"인 " +nam.name+"을(를) 구매한다");
	}
} 
