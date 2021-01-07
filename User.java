package com.vastika.model;

public class User {
	private int id;
	private String name;
	private int account_no;
	private String email;
	private long mobile_no;
	private int balance;
	private int withdrawn_amt;
	private int deposit_amt;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getWithdrawn_amt() {
		return withdrawn_amt;
	}
	public void setWithdrawn_amt(int withdrawn_amt) {
		this.withdrawn_amt = withdrawn_amt;
	}
	public int getDeposit_amt() {
		return deposit_amt;
	}
	public void setDeposit_amt(int deposit_amt) {
		this.deposit_amt = deposit_amt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account) {
		this.account_no = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile) {
		this.mobile_no = mobile;
	}
	
}
