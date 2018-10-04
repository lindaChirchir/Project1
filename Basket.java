


public class Basket {
	private MarketProduct[] arr;                      // array of type MarketProduct

	public Basket() {
		this.arr= new MarketProduct[0];

	}

	public  MarketProduct[] getProducts(){
		MarketProduct[] shallowCopyArr= new MarketProduct [arr.length];
		for (int i = 0; i < arr.length; i++) {
			shallowCopyArr[i]= arr[i];	
		}
		return shallowCopyArr;
	}

	//----effects done on shallow copy are seen on the original arr

	public void add(MarketProduct e ) {
		int size= arr.length;

		MarketProduct[] bigArr= new MarketProduct[arr.length + 1];
		if (size >= 1) {
			for(int i=0; i <arr.length; i++) {
				bigArr[i]=arr[i];
			}
		}
		bigArr[size]=e;          //add the element after the for loop of copying the elements

		arr=bigArr;
	}



	public boolean remove(MarketProduct myProd) {

		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(myProd)) {
				arr = removeHelper(i);
				return true;               //exits the loop
			}
		}
		return false;
	}

	private MarketProduct[] removeHelper(int index) {
		MarketProduct[] temp = new MarketProduct[arr.length - 1];
		int copyIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i != index) {
				temp[copyIndex] = arr[i]; 
				copyIndex++;
			}
		}
		return temp;
	}


	public void clear() {
//		for(int i=0; i < arr.length; i++) {
//			arr[i]= null;	
//		}		
		arr = new MarketProduct[0];
	}

	public int getNumOfProducts() {
		int num = this.getProducts().length;
		return num;
	}

	public int getSubTotal() {
		int subTotal=0;
		for(int i=0;i < arr.length; i++) {
			subTotal += arr[i].getCost();

		}
		return subTotal;
	}                                   //don't need to call getCost() on every instance as arr is of type MrketProd
	public int getTotalTax() {

		int totalTax=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Jam) {
				totalTax+= (int)(arr[i].getCost() * 0.15);	
			}
		}
		return totalTax;
	}

	public int getTotalCost() {
		int jamTax= getTotalTax();
		int totalCost= getSubTotal( )+ jamTax;	
		return totalCost;
	}

	public String toString() {
		String item = "";
		for(int i=0; i<arr.length; i++) {
			item += this.arr[i].getName() + "\t" +StringFormatter( arr[i].getCost()) + "\n";
		}
		item += "\n" + StringFormatter(getSubTotal()) + "\n" + StringFormatter(getTotalTax()) + "\n\n" + StringFormatter(getTotalCost());
		return item;
	}
	private String StringFormatter(int amount) {
		//String returnType= "";
		int val= amount/100;
		int myVal= amount%100;
		if(amount <=0) {
			return "-";
		}
		else if(myVal<10) {
			return val + ".0" + myVal;
		}
		else {
			return val + "." + myVal;
		}
		
	}
}





