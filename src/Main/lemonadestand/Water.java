package Main.lemonadestand;

public class Water {

	public int amount;
	public String unit;

	public Water(int amount, String unit) {
		super();
		this.amount = amount;
		this.unit = unit;
	}
	
	public void drink(int amount) {
		if (this.amount < amount) {
			throw new IllegalArgumentException("You cannot drink more water than is available. Amount of water available: " + this.amount);
		} else {
			this.amount -= amount;
		}
	}

}
