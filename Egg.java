
public class Egg extends MarketProduct {
	private int numOfEggs;
	private int price;   
	
	
	public Egg(String nameOfProd,int numReq,int price) {
		super(nameOfProd);
		this.numOfEggs= numReq;
		this.price= price;
	}
	
	
	public int getCost() {
		int cost= (numOfEggs*price)	/12;
		return cost;
		//round down thing not yet done.
	} 
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Egg) {
			Egg egg = (Egg) obj;        //cast obj to Egg to  access the name,cost and also tobe able to access  private numOfEggs since it will be  a var inside the class Egg.
										// new var egg that holds cast input
			if(this.getName().equals(egg.getName()) && this.getCost()==egg.getCost() && this.numOfEggs == egg.numOfEggs) { 
				return true;	
			}

		}

		return false;
	}
}




