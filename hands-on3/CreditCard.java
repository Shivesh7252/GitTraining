package com.org.gen.day3;
interface CreditCard {
	int rupees = 0;
	int dollar = 0;
	int pounds = 0;
	String ccNum = "";
	String expDate = "";
}
class Bank_Account implements CreditCard {
	 int rupees;
	 int dollar;
	 int pounds;
	 String ccNum;
	 String expDate;
	 String username;
	 String bankaccount_no;
	 
	
	public Bank_Account(int rupees, int dollar, int pounds, String ccNum, String expDate, String username,
			String bankaccount_no) {
		super();
		this.rupees = rupees;
		this.dollar = dollar;
		this.pounds = pounds;
		this.ccNum = ccNum;
		this.expDate = expDate;
		this.username = username;
		this.bankaccount_no = bankaccount_no;
	}


	void display() {
		System.out.println("username:" + this.username);
		System.out.println("bankaccount_no:" + this.bankaccount_no);
		System.out.println("rupees:" + this.rupees);
		System.out.println("dollar:" + "$" +this.dollar);
		System.out.println("pounds:" + this.pounds);
		System.out.println("ccNum:" + this.ccNum);
		System.out.println("expDate:" + this.expDate);
	}
	 
} 
public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bank_Account bank = new Bank_Account(100,200,400,"DEC","3/03/2022","Paurash","34556788986");
         bank.display();
	}

}
