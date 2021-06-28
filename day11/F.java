abstract class F 
{
	//abstract final void m(); //안됨!!
	//abstract는 오버라이딩을 해야 그 객체를 사용할 수 있고
	//final은 오버라이딩을 못하게 하므로 서로 상반되는 의미를 갖고있다.
	//그러므로 저 문장은 문법적으로 오류!->컴파일 오류
}
