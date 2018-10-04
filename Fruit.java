
public class Fruit extends MarketProduct {
	private double weight; 
	private int price; 
	
	public Fruit(String nameOfProd, double weight, int price) {
		super(nameOfProd);
		this.weight= weight;
		this.price= price;

	}

	
	
	public int getCost() {
		int cost= (int)(weight* price);
		return cost;
	}

	
	public boolean equals(Object input) {

		if(input instanceof Fruit) {
			Fruit myFruit= (Fruit) input; 
			if(this.getName().equals(myFruit.getName()) && this.weight== myFruit.weight && this.getCost()== myFruit.getCost()){
				return true;
			}
		}

		return false;
	}
}

