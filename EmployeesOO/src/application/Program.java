package application;

import java.util.Scanner;

import entities.Adress;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name's Department: ");
		String name_depart=sc.nextLine();
		
		System.out.print("Payday: ");
		int payday=sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		
		System.out.print("Phone: ");
		String phone = sc.next();
		
		Department department1= new Department(name_depart,payday,new Adress(email,phone));
		
		
		System.out.print("How many employees does the department have: ");
		int n_employees = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n_employees;i++) {
			
			System.out.printf("Data of employee %d \n", i+1);
			
			System.out.print("Name: ");
			String name_emp = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			department1.addEmployee(new Employee(name_emp,salary));
			
		}
		
		System.out.println();
		
		showReport(department1);
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.println("Paylroll:");
		System.out.printf("Department %s = $%.2f \n" ,dept.getName() ,dept.payroll());
		
		System.out.println("Employees: ");
		
		for(Employee employees : dept.getList()) {
			System.out.println(employees.getName());
		}
		System.out.printf("Payday: %d \n", dept.getPayday());
		System.out.printf("For any questions, please contact %s", dept.getAdress().getEmail());
	}
}
