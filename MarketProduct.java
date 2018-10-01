
public abstract class MarketProduct {
	private String name;
		public MarketProduct(String nameOfProd) {
		 this.name= nameOfProd;
		}
			//public MarketProduct() {
				
			//}
				public  final String getName() {
				return this.name;
			}
					public abstract int getCost();
						public abstract boolean equals(Object obj);
					
}
