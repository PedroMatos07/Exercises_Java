package entities;

import java.time.LocalDate;

public class HourContract {
	private Integer hours;
	private Double valuePerHour;
	private LocalDate date;
	
	public HourContract(Integer hours, Double valuePerHour, LocalDate date) {
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		this.date = date;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public double totalValue() {
		return getValuePerHour() * getHours();
	}
	
	
}
