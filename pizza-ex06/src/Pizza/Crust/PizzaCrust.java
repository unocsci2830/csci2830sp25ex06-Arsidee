package src.Pizza.Crust;


public abstract class PizzaCrust implements MenuItem {
	private String ingredient;
	
	public PizzaCrust() {
		this.ingredient = "";
	}
	
	public abstract String toString(); 

	public String toNiceString() {
		return "Crust: " + this.toString() + "(" + this.ingredient + ")" + " $" + this.getprice();
	}
	
	public String getIngredient() {
		return this.ingredient;
	}
	
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String checkIntegrity() {
		return "";
	}
	@Override
	public Double getprice() {
		return 3.00;
	}
}
