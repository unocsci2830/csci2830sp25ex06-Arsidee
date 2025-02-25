package src.Pizza.Crust;


public class ThickCrust extends PizzaCrust {
	private Boolean isDeepDish;
	
	@Override
	public String toString() {
		return "Thick Crust";
	}

	public String toNiceString() {
		return super.toNiceString() + (this.isDeepDish? " (Deep Dish)": "");
	}
	
	public Boolean getIsDeepDish() {
		return this.isDeepDish;
	}
	
	public void setIsDeepDish(Boolean isDeepDishBool) {
		this.isDeepDish = isDeepDishBool;
	}

	@Override
	public String checkIntegrity() {
		return this.getIngredient().equalsIgnoreCase("Cauliflower")? "Hanfle carefully: crust might fall apart" : super.checkIntegrity();
	}
}
