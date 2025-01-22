package entities;

import java.util.ArrayList;
import java.util.List;


public class Department {
	private String name;
	private int payday;
	
	private Adress adress;
	private List<Employee> list = new ArrayList<>();
	
	public Department(String name, int payday, Adress adress) {
		super();
		this.name = name;
		this.payday = payday;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayday() {
		return payday;
	}

	public void setPayday(int payday) {
		this.payday = payday;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public List<Employee> getList() {
		return list;
	}
	
	public void addEmployee(Employee employee) {
		list.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		list.remove(employee);
	}
	
	public double payroll() {
		double sum=0;
		for(Employee employee : list) {
			sum+=employee.getSalary();
		}
		
		return sum;
	}
	
	
	
}
