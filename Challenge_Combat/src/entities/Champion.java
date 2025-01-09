package entities;

public class Champion {
	private String name;
	private int attack;
	private int armor;
	private int health;
	
	public Champion(String name,int health,int attack,int armor) {
		this.name=name;
		this.health=health;
		this.attack=attack;
		this.armor=armor;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAttack() {
		return attack;
	}



	public void setAttack(int attack) {
		this.attack = attack;
	}



	public int getArmor() {
		return armor;
	}



	public void setArmor(int armor) {
		this.armor = armor;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public void takeDamage(int attack) {
		if (attack >= armor) {
			this.health-=attack-this.armor;
		}
		else {
			this.health-=1;
		}
		
	
		
	}
	
	
	public String Status() {
		
		if(this.health<0 || this.health==1) {
			System.out.printf("%s died \n", this.name);
			this.health=0;
		}
	    return String.format("%s: %d of health",this.name, this.health);
	}

	
	
	
}
