package application;
import java.util.Scanner;

import entities.Account;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account1 = null;
		 
		System.out.print("Enter account number: ");
		int account1_number=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter account name: ");
		String account1_name=sc.nextLine();
		
		System.out.print("Is there an initial deposit(y/n)? " );
		char aux = sc.next().charAt(0);
		
		
		
		if(aux=='n') {
			account1 = new Account(account1_number, account1_name);
		}
		else if(aux=='y') {
			System.out.print("Enter initial deposit value: ");
			double account1_deposit= sc.nextDouble();
			account1= new Account(account1_number, account1_name, account1_deposit);
			
		}
		
		System.out.println("Account data: " + account1);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account1.Deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println("Account data: " + account1);

		
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account1.Withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println("Account data: " + account1);

		sc.close();
	}

}
