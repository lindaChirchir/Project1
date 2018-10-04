

public class Jam extends MarketProduct{
	private int numJars;
	private int price;
	
	public Jam(String nameOfProd, int numJars, int price) {
		super(nameOfProd);
		this.numJars= numJars;
		this.price= price;
	}
	
	
	public int getCost() {
		int cost= numJars * price;
		return cost;
	}

	
	public boolean equals(Object input) {

		if(input instanceof Jam) {
			Jam myJam= (Jam) input;            // create new var that holds cast input to jam so that can acccess private fields and get methods
			if(this.getName().equals(myJam.getName()) && this.getCost()==myJam.getCost() && this.numJars== myJam.numJars) {
				return true;	
			}
		}
		return false;
	}
}
