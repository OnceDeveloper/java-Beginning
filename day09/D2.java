class Account2{
	private String name = "ȫ�浿";
	private long balance = 20000L;
	
	String getName(){
		return name;
	}

	long getBalance(){
		return balance;
	}

	void setBalance(long balance){
		this.balance = balance;
	}
}

class D2{

	public static void main(String[] args) 
	{
		Account2 acc = new Account2();
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		acc.setBalance(23323L);
		System.out.println(acc.getBalance());
		
	}
}
