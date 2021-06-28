class Figure1 extends Object
{	
	void draw(){
		System.out.println("도형을 그리다");
	}
}

class Rec1 extends Figure1
{	
	void draw(){
		System.out.println("사각형을 그리다");
	}
}

class Tri extends Figure1
{	
	void draw(){
		System.out.println("삼각형을 그리다");
	}
}

class Circle extends Figure1
{	
	void draw(){
		System.out.println("원형을 그리다");
	}
}

class C1{

	public static void main(String[] args) 
		{
			Figure1 f1 = new Figure1();
			Figure1 f2 = new Rec1();
			//Rec1 r = new Rec1();
			Figure1 f3 = new Tri();
			Figure1 f4 = new Circle();
			f1.draw(); f2.draw(); f3.draw(); f4.draw(); //r.draw();
		}
}
