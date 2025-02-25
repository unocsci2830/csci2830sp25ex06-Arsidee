package topping;

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
