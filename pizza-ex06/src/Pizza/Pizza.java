package src.Pizza;
import java.util.ArrayList;
import src.Pizza.Sauce.PizzaSauce;
import src.Pizza.Crust.PizzaCrust;
import src.Pizza.Topping.PizzaTopping;


public class Pizza implements MenuItem {
	private PizzaCrust crust;
	private PizzaSauce sauce;
	private ArrayList<PizzaTopping> toppingList;
	private ArrayList<MenuItem> selectionList;
	
	public Pizza() {
		this.crust = null;
		this.sauce = null;
		this.toppingList = new ArrayList<PizzaTopping>();
		this.selectionList = new ArrayList<MenuItem>();
	}

	public PizzaCrust getCrust() {
		return this.crust;
	}

	public void setCrust(PizzaCrust crust) {
		this.crust = crust;
		this.selectionList.add(crust);
	}

	public PizzaSauce getSauce() {
		return this.sauce;
	}

	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
		this.selectionList.add(sauce);
	}

	public ArrayList<PizzaTopping> getTopping() {
		return this.toppingList;
	}

	public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
	}

	public void addTopping(PizzaTopping topping) {
		this.toppingList.add(topping);
		this.selectionList.add(topping);
	}
	
	public void display() {
		System.out.println("Pizza: $" + this.getprice());
		System.out.println("	" + this.crust.toNiceString());
		System.out.println("	" + this.sauce.toNiceString());
		for (PizzaTopping t : this.toppingList) {
			System.out.println("	" + t.toNiceString());
		}
	}
	// @Override
	// public Double getprice() {
	// 	Double totalPrice = 0.0;
	// 	totalPrice += this.crust.getprice();
	// 	totalPrice += this.sauce.getprice();
	// 	for (PizzaTopping t : this.toppingList) {
	// 		totalPrice += t.getprice();
	// 	}
	// 	return totalPrice;
	// }
	@Override
	public Double getprice() {
		Double totalPrice = 0.0;
		for (MenuItem m : this.selectionList) {
			totalPrice += m.getprice();
		}
		return totalPrice;
	}
}
