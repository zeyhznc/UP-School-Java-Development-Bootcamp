package org.javaturk.oopj.ch11.HOMEWORK;

public class Account {
	// balance:bakiye
	public String accountName;
	public double loadedAmount;
	public double takenAmount;
	public double balance;
	
	public double sentAmount;
		
	AccountClient belongsTo;
	
	public Account() {
		
	}
	
	public Account(String accountName, double balance) {
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public double getLoadedAmount() {
		return loadedAmount;
	}

	public void setLoadedAmount(double loadedAmount) {
		this.loadedAmount = loadedAmount;
	}

	public double getTakenAmount() {
		return takenAmount;
	}

	public double setTakenAmount(double sentAmount) {
		this.takenAmount = sentAmount;
		return takenAmount;
	}
	
	public double getSentAmount() {
		return sentAmount;
	}

	public void setSentAmount(double sentAmount) {
		this.sentAmount = sentAmount;
	}

	// Para yatırmayı "increaseBalance()" olarak tanımladım
	public double increaseBalance(double loadedAmount) {
		balance += loadedAmount;
		return balance;
	}
	
//Para çekmeyi "decreaseBalance()" olarak tanımladım
	public double decreaseBalance(double takenAmount){
		balance -= takenAmount;
		return balance;
	}
	
	public double transferMoney(double sentAmount) {
		balance += sentAmount;
		return balance;
	}
	
	
	
	public double reflectTransferExpense() {
		double x = (sentAmount*30) / 100;
		balance -= x;
		return balance;
	}

	public void getInfo(){
		System.out.println("The information of the account" + " " +accountName+ ":");
		System.out.println("Balance: " +balance);
	}
	
	
// Havale yapan hesap için kullanılacak metod
	public void getInfoForTransfer(){
		System.out.println("The information of the account" + " " +accountName+ ":");
		System.out.println("Balance: " +balance);
	}


// Havaleyi alana hesap için kullanılacak metod
	public void getTransferTakenInfo() {
		balance += sentAmount;
		System.out.println("The information of the account" + " " +accountName+ ":");
		System.out.println("Balance: " +balance);
	}
		
	
	
	
}


class AccountClient {
	public String clientName;	
	
	Account owns;
	
	public AccountClient() {
		
	}

	public AccountClient(String clientName) {
		this.clientName = clientName;		
	}
	
}






