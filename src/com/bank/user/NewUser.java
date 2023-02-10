package com.bank.user;

import java.io.Serializable;

@SuppressWarnings("serial")
public class NewUser implements Serializable {
	private String userName;
	private long accountNumber;
	private String gender;
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "\nUser : [userName=" + userName + ", accountNumber=" + accountNumber + ", gender=" + gender
				+ ", balance=" + balance + " Rs.]\n";
	}
	
}
