
public class Egg extends MarketProduct {
	private int numOfEggs;
	private int price;   //price per dozen
		public Egg(String nameOfProd,int numReq,int price) {
			super(nameOfProd); //invoking constructor from superClass with String as an argument
			this.numOfEggs= numReq;
			this.price= price;
		}
			public int getCost() {
			int cost= (numOfEggs*price)	/12;
			return cost;
			//round down thing not yet done.
			} 
				public boolean equals(Object egg) {
				
					 boolean testObj = false;
					/*if(this.equals(egg)) {
					testObj=true;	
				}	*/
					 
					 if(egg instanceof Egg) {
						testObj=true; 
					 }
					 
					return testObj;
				}
		}



