package Entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue ;
	public int softDrink;
	
	
	public double feeding() {
		double aux=0;
		if (beer>0) {
			aux+=beer*5;
		}
		if (softDrink>0) {
			aux+=softDrink*3;
		}
		if(barbecue>0) {
			aux+=barbecue*7;
		}
		
		return aux;
	}
	
	public double cover() {
		double aux=feeding();
		if (aux>30) {
			return 0;
		}
		else return 4;
	}
	
	public double ticket() {
		if (gender=='M') {
			return 10;
		}
		else return 8;
	}
	
	public double total() {
		return feeding()+ticket()+cover();
	}
	
}
