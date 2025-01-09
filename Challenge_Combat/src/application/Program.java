package application;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the data of the first champion: ");
		
		System.out.print("Name: ");
		String championA_Name=sc.nextLine();
		
		System.out.print("Health: ");
		int championA_Health=sc.nextInt();
		
		System.out.print("Attack: ");
		int championA_Attack=sc.nextInt();
		
		System.out.print("Armor: ");
		int championA_Armor=sc.nextInt();
		
		System.out.println();
		sc.nextLine();
		
		System.out.println("Enter the data of the second champion: ");
		
		System.out.print("Name: ");
		String championB_Name=sc.nextLine();
		
		System.out.print("Health: ");
		int championB_Health=sc.nextInt();
		
		System.out.print("Attack: ");
		int championB_Attack=sc.nextInt();
		
		System.out.print("Armor: ");
		int championB_Armor=sc.nextInt();
		
		Champion championA = new Champion(championA_Name,championA_Health,championA_Attack,championA_Armor);
		Champion championB = new Champion(championB_Name, championB_Health, championB_Attack, championB_Armor);
		
		System.out.println("Enter numbers of round: ");
		int rounds = sc.nextInt();
		
		
		for(int i=0;i<rounds;i++) {
			System.out.printf("Result of round %d \n", i+1);
			
			championA.takeDamage(championB.getAttack());
			championB.takeDamage(championA.getAttack());
			System.out.println(championA.Status());
			System.out.println(championB.Status());
			System.out.println();
			if(championA.getHealth()==0||championB.getHealth()==0) {
				System.exit(0); 
			}
		}
		
		sc.close();
		System.out.println("End of Combat");
		

	}

}
