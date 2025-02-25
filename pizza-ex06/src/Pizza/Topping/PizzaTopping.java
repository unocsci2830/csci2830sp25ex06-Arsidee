package src.Pizza.Topping;

import src.Pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem {
	public abstract String toString(); 
	
	public String toNiceString() {
		return "Topping: " + this.toString() + " $" + this.getprice();
	}
	@Override
	public Double getprice() {
		return 1.00;
	}
}
