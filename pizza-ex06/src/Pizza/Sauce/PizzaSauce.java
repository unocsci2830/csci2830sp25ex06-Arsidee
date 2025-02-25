package src.Pizza.Sauce;

import src.Pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Sauce: " + this.toString() + " $" + this.getprice();
	}
	@Override
	public Double getprice() {
		return 0.25;
	}
}
