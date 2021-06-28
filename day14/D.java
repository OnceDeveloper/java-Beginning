class D {
	class DD {
		protected class DDD {
			public class DDDD
			{
				int i = 10;
				void m(){
					System.out.println("DDDD의 m()");
				}
			}
		}
	}
}
class DChild extends D // DChild is a D ( O )
{
	DChild(){
		super(); //생성자의 첫번째 라인에서만 super() 가능!
	}
	void use(){
		/*D.DD.DDD.DDDD dddd = new D().new DD().new DDD().new DDDD();
		System.out.println("dddd.i: " + dddd.i);
		dddd.m();*/

		D.DD.DDD.DDDD dddd = this.new DD().new DDD().new DDDD();
		System.out.println("dddd.i: " + dddd.i);
		dddd.m();
	}
	public static void main(String args[]){
		new DChild().use();	
	}
}