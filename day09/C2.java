class Figure2{
	void draw(){
		System.out.println("�׸��� �׸���");
	}
}
class Rec2 extends Figure2{
	void draw(){
		System.out.println("�簢���� �׸���");
	}
}

class Tri2 extends Figure2{
	void draw(){
		System.out.println("�ﰢ���� �׸���");
	}
}

class Circle2 extends Figure2{
	void draw(){
		System.out.println("������ �׸���");
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
