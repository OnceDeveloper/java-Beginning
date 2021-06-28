class Account1{
	private String ssn = "123456-123456";
	private long balance = 10000L;

	String getSsn(){
		return ssn;
	}
	
	void setSsn(String ssn){
		this.ssn = ssn;
	}

	long getBalance(){
		return balance;
	}
	void setBalance(long balance){
		this.balance = balance;
	}
}
class D1 {
	public static void main(String[] args) 
	{
		Account1 acc = new Account1();
		System.out.println("ssn : "+acc.getSsn());
		acc.setSsn("22222222");
		System.out.println("¹Ù²ï ssn : "+acc.getSsn());
		acc.setBalance(32030L);
		System.out.println("¹Ù²ï balance : " +acc.getBalance());
		
	}
}
