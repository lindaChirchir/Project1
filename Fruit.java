
public class Fruit extends MarketProduct {
private double weight; //in kg
private int price; // price per kg
	public Fruit(String nameOfProd, double weight, int price) {
		super(nameOfProd);
		this.weight= weight;
		this.price= price;
	
	}
		public  double getWeight() { //non static
		return this.weight;
		}
			public int getPrice() { // non static
			return this.price;	
			}
				public int getCost() {
					int cost= (int)weight* price;
					return cost;
				}

	// equals method not yet
public boolean equals(Object fruit) {
	boolean test= false;
	
	/*if(this.equals(fruit)) {
		test= true;
	}*/
	if(fruit instanceof Fruit) {
		test=true; 
	 }
	 
	return test;
}
}

