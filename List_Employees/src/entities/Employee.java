package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void Increase(double percentage) {
		
		this.salary += this.salary * percentage / 100.0;
	}
	
	 public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	    }
}
