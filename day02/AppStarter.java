class Appstarter
{
	public static void main(String[] args) 
	{
		Person hw = new Person();
		System.out.println("나이가 "+hw.age+"살인 혜원이가 등장했다");
		hw.play();
		hw.buy(hw.g1);
		hw.buy(hw.g4,hw.g2);
	}
}
