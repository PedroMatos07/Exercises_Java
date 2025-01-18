package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.TaxPayer;

public class program {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many taxpayer will you insert: ");
		int n_taxpayer= sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 0 ; i<n_taxpayer;i++) {
			System.out.printf("Enter the data for the %d taxpayer. \n",i+1);
			System.out.print("Current income with salary: ");
			double salary = sc.nextDouble();
			System.out.print("Current income with service: ");
			double service= sc.nextDouble();
			System.out.print("Current income with capitalL: ");
			double capital = sc.nextDouble();
			System.out.print("Health Spending: ");
			double health=sc.nextDouble();
			System.out.print("Education Spending: ");
			double education= sc.nextDouble();
			System.out.println();
			list.add(new TaxPayer(salary,service,capital,health,education));
			

		}
		
		System.out.println();
		
		for(TaxPayer taxpayer : list) {
			System.out.printf("Total gross tax: %.2f \n", taxpayer.grossTax());
			System.out.printf("Tax rebate: %.2f \n", taxpayer.taxRebate());
			System.out.printf("Net tax: %.2f \n", taxpayer.netTax());
			System.out.println();
		}
	
		sc.close();
	}
}
