package entities;

public class TaxPayer {
		
	private Double salaryIncome;
	private Double serviceIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.serviceIncome = serviceIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServiceIncome() {
		return serviceIncome;
	}

	public void setServiceIncome(Double serviceIncome) {
		this.serviceIncome = serviceIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	
	public double salaryTax() {
		double monthlySalary = getSalaryIncome() /12;
	    if (monthlySalary < 3000) {
	        return 0;
	    }
	    else if (monthlySalary >= 3000 && monthlySalary <= 5000) {
	        return getSalaryIncome() * 0.1;
	    }
	    else if (monthlySalary > 5000) {
	        return getSalaryIncome() * 0.2;
	    }
	    return 0; 
	}

	
	public double serviceTax() {
		if(getServiceIncome()>0) {
			return 0.15 * getServiceIncome();
		}
		else {
			return 0;
		}
	}
	
	public double capitalTax() {
		if(getCapitalIncome()>0) {
			return  getCapitalIncome() * 0.2;
		}
		else {
			return 0;
		}
	}
	
	public double grossTax() {
		return salaryTax()+serviceTax()+capitalTax();
		
	}
	
	
	public double taxRebate() {
		if(getHealthSpending()+getEducationSpending()>(grossTax()*0.3)) {
			return grossTax()*0.3;
		}
		
		else {
			return getHealthSpending()+getEducationSpending();
		}
	}
	
	public double netTax() {
		return grossTax()-taxRebate();
	}
	
	
	
}
