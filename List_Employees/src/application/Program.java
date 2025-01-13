package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;



public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered: ");
		int n_employees = sc.nextInt();

		
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<n_employees;i++) {
			System.out.printf("Employee: %d \n", i+1);
			System.out.print("Id: ");
			
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			
			System.out.print("Name: ");
			String name=sc.nextLine();
			
			System.out.print("Salary: ");
			double salary= sc.nextDouble();
			
			
			list.add(new Employee(id, name, salary));
			
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int aux_id=sc.nextInt();
		
		
		
		Employee emp = list.stream().filter(x -> x.getId() == aux_id).findFirst().orElse(null);
		if(emp!=null) {
			System.out.print("Enter the percentage: ");
			double percentage=sc.nextDouble();
			emp.Increase(percentage);
		}
		
		else {
			System.out.println("This id doesn't exists!");
		}
		
		// PART 3 - LISTING EMPLOYEES:
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee employee : list) {
		    System.out.println(employee);
		}
		
		

		
		sc.close();
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
