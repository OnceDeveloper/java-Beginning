class Figure
{
	void draw(){
		System.out.println("������ �׸���");
	}
}
class Rec extends Figure
{
	void draw(){ //�������̵� 
		System.out.println("�簢���� �׸���");
	}
} 
class Triangle extends Figure
{
	void draw(){ //�������̵� 
		System.out.println("�ﰢ���� �׸���");
	}
} 
class Circle extends Figure
{
	void draw(){ //�������̵� 
		System.out.println("������ �׸���");
	}
}

class C 
{
	public static void main(String args[]){
		Figure f1 = new Figure();
		Figure f2 = new Rec();
		Figure f3 = new Triangle();
		Figure f4 = new Circle();
        f1.draw(); f2.draw(); f3.draw(); f4.draw(); 
	}
}

