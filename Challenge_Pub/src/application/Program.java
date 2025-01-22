package application;
import java.util.Scanner;
import Entities.Bill;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bill bill1 = new Bill();
		
		System.out.print("Gender: ");
		
		bill1.gender = Character.toUpperCase(sc.next().charAt(0));
		
		System.out.print("Quantity of beers: ");
		
		bill1.beer= sc.nextInt();
		
		System.out.print("Quantity of Sodas: ");
		bill1.softDrink=sc.nextInt();
		
		System.out.print("Quantity of skewers: ");
		bill1.barbecue=sc.nextInt();
		
		System.out.println();
		
		System.out.println("BILL:");
		System.out.printf("Feeding : R$ %.2f \n" , bill1.feeding());
		System.out.printf("Cover Charge : R$ %.2f \n",bill1.cover() );
		System.out.printf("Ticket : R$ %.2f \n", bill1.ticket());
		
		System.out.printf("Total : R$ %.2f", bill1.total());
		
		sc.close();
		
		
	}

}
