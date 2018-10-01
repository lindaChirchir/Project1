
//qstsn--- check the issue about array constants can only be used in initializers(initializing arr as empty in constructor)


public class Basket {
	private MarketProduct[] arr;                      // array of type MarketProduct

	public Basket() {
		arr= new MarketProduct[10];

	}

	public  MarketProduct[] getProducts(){
		MarketProduct[] shallowCopyArr= new MarketProduct [arr.length];
		for (int i = 0; i < arr.length; i++){
			shallowCopyArr[i]= arr[i];	
		}
		return shallowCopyArr;
	}

	//----effects done on shallow copy are seen on the original arr

	public void add(MarketProduct e ) {
		int size= arr.length;
		if(arr[size+1].equals(null)) {
			arr[size+1]=e;
		}
		else {
			MarketProduct[] bigArr= new MarketProduct[arr.length*2];
			for(int i=0; i <arr.length; i++) {
				bigArr[i]=arr[i];
				bigArr[size+1]=e;
			}
			arr=bigArr;
		}


		//----------------------------------------------------------------------------------------
		/*	if(arr.length==arr.size) {
			MarketProduct[] bigArr= new MarketProduct[arr.length*2];
			for(int i=0; i <arr.length; i++) {
			bigArr[i]=arr[i];	

		bigArr.add(e);
		}
			}
	this.add(e);*/
		//-----------------------------------------------------------------------------------------
	} 

	public boolean remove(MarketProduct myProd) {
		boolean product =true;
		for(int i=0; i<arr.length; i++) {
			boolean item= arr.equals(myProd);
			if(item==true) {
				this.remove(myProd);
				break;
				//----------- if I use arr.remove() there is an error			
			}
			else {
				product = false;
			}}
		return product;
	}
	public void clear() {
		this.clear();	
		//-----------------------------------------------------------------------	
		//arr.clear(); has error WHY? I can't invoke array of mrktprod yet afterall thisbasket has array of mrktprod inside it
	}

	public int getNumOfProducts() {
		int num = this.getProducts().length;
		//------------------------------------------------------		
		//int num =this.length; had an error why?		
		return num;
	}
}




