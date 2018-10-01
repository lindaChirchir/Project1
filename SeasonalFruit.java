
public class SeasonalFruit extends Fruit {
	public SeasonalFruit(String nameOfProd, double weight, int price) {
		super(nameOfProd,weight, price);
	}	
		public int getCost() {
			int cost = (int)(super.getCost()* 0.85);  // used super to invoke getCost mthd in super class
			return cost;
		}
}
