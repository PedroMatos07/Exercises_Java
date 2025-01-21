package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter department's name: ");
		String department= sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		
		System.out.print("Base salary: ");
		double salary = sc.nextDouble();
		
		Worker worker1 = new Worker(name,WorkerLevel.valueOf(level.toUpperCase()),salary,new Department(department));
		
		System.out.println(worker1.getLevel());
		sc.nextLine();
		
		System.out.print("How many contracts to this worker: ");
		int n_contracts = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i=0;i<n_contracts;i++) {
			System.out.printf("Enter contract #%d", i+1);
			
			System.out.print("Date (DD/MM/YYYY): ");
			String date = sc.nextLine();
			
			LocalDate datef = LocalDate.parse(date,formatter);
			
			System.out.print("Value per hour: ");
			double value_hour=sc.nextDouble();
			
			System.out.print("Duration (Hour): ");
			int hours = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			worker1.addContracts(new HourContract(hours,value_hour,datef));
			
			
		}
		
		
		System.out.print("Enter year to calcule income(YYYY)): ");
		int year = sc.nextInt();
		System.out.print("Enter month to calcule income(MM)): ");
		int month = sc.nextInt();
		
		System.out.printf("Name: %s \n", worker1.getName() );
		System.out.printf("Department: %s \n",worker1.getDepartment().getName());
		System.out.printf("Level: %s \n", worker1.getLevel());
		System.out.printf("Income for %d/%d : %.2f",month,year,worker1.income(month, year));
		
		
		sc.close();
	}

}
