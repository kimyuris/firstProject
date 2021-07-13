package co.yedam.account;

public class Account {
	//필드

	private String ano;// 계좌
	private String owner;// 예금주
	private int balance;// 현재잔액
	//생성자
	public Account() {
		
	}
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	//메소드
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
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

	public String showInfo() {
		String info = ano + " " + owner + " " + balance;
		return info;
	}

}
