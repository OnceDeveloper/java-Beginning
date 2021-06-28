class Figure2{
	void draw(){
		System.out.println("그림을 그린다");
	}
}
class Rec2 extends Figure2{
	void draw(){
		System.out.println("사각형을 그린다");
	}
}

class Tri2 extends Figure2{
	void draw(){
		System.out.println("삼각형을 그린다");
	}
}

class Circle2 extends Figure2{
	void draw(){
		System.out.println("원형을 그린다");
	}
}



class C2{
	public static void main(String[] args) 
	{
		Figure2 f1 = new Figure2();
		Figure2 f2 = new Rec2();
		Figure2 f3 = new Tri2();
		Figure2 f4 = new Circle2();
		f1.draw(); f2.draw(); f3.draw(); f4.draw();
	}
}
