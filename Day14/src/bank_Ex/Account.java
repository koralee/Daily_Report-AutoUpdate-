package bank_Ex;

public class Account {

	private String Ac;	// 계좌번호	
	private String owner;	// 계좌 소유주 
	private int balance;	// 잔고
	
	public Account(String Ac, String owner, int balance) {
		this.Ac = Ac;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAc() {
		return Ac;
	}

	public void setAc(String ac) {
		Ac = ac;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
		
}
