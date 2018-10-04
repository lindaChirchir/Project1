
public class Customer {
	private String name;
	private int balance;
	private Basket products;

	public Customer(String name, int initBal) {
		products= new Basket();
		this.name= name;
		this.balance= initBal;

	}
	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return balance;
	}

	public Basket getBasket() {
		return this.products;
	}

	public int addFunds( int amount) {
		if(amount<0) {
			throw new  IllegalArgumentException("invalid balance");
		}
		else {
			balance += amount;
		}
		return balance;
	}

	public void addToBasket(MarketProduct item) {
		products.add(item);
	}


	public boolean removeFromBasket(MarketProduct item) {
//		boolean checker= true;
//		if(products.remove(item)==true) {
//			checker=true;
//		}
//		else {checker= false;}
//		return checker;
		return products.remove(item);
	}

	public String checkOut() {
		int totalCost= products.getTotalCost();
		if(totalCost <= this.balance) {
			balance= balance-totalCost;
			return products.toString();
		}
		else {
			throw new IllegalStateException("Not enough balance");
		}
	}
}







