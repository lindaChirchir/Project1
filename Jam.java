
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
//equals method not yet
			public boolean equals(Object jam) {
				boolean test= false;
				
				/*if(this.equals(jam)) {
					test=true;
				}*/
				
				if(jam instanceof Jam) {
					test=true; 
				 }
				return test;
			}
}
