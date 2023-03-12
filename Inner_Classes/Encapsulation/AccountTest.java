package org.javaturk.oopj.ch11.HOMEWORK;

public class AccountTest {

	public static void main(String[] args) {		
		Account account1 = new Account ("Account 1", 500.00);
		Account account2 = new Account ("Account 2", 200.00);

// account3 havale yapar. account4 havaleyi alır.
// account3 50 TL havale yapar. 		
		Account account3 = new Account ("Account 3", 400.00);
		account3.setSentAmount(50.00);
		//account3.getSentAmount();
		account3.reflectTransferExpense();
		account3.getInfoForTransfer();
		
		System.out.println("**********************");
		
		Account account4 = new Account ("Account 4", 300.00);
		account4.getSentAmount();
		account4.setSentAmount(50.00);
		account4.getTransferTakenInfo();
		
		System.out.println("**********************");
		
		AccountClient client1 = new AccountClient("Client 1");		
		AccountClient client2 = new AccountClient("Client 2");
		
		AccountClient client3 = new AccountClient("Client3");
		AccountClient client4 = new AccountClient("Client4");
		
		
		account1.belongsTo = client1;
		client1.owns = account1;
		
		account2.belongsTo = client2;
		client2.owns = account2;
		
		
		account3.belongsTo = client3;
		client4.owns = account3;

//AccountClient nesnesi Account nesnesi üzerinde para yatırma işlemi yapıyor		
		account1.increaseBalance(250.30);
		account1.getInfo();
		
		System.out.println("******************************");
		
// AccountClient nesnesi Account nesnesi üzerinde para çekme işlemi yapıyor.
		account2.decreaseBalance(50.40);
		account2.getInfo();
		
		
		
		
		
		
		
		
		
	}

}
