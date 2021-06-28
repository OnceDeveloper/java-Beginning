class Figure
{
	void draw(){
		System.out.println("도형을 그리다");
	}
}
class Rec extends Figure
{
	void draw(){ //오버라이딩 
		System.out.println("사각형을 그리다");
	}
} 
class Triangle extends Figure
{
	void draw(){ //오버라이딩 
		System.out.println("삼각형을 그리다");
	}
} 
class Circle extends Figure
{
	void draw(){ //오버라이딩 
		System.out.println("원형을 그리다");
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

