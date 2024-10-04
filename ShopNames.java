package in.nit.workshop;

public class ShopNames {
	
	public static void main(String args[]) {
		
		System.out.println("Array elements");
		String shopNames[] = {"coffeeshop","teashop","panshop","lassishop"};
		for(int index = 0; index < shopNames.length; index++) {
            System.out.println(shopNames[index]);
		}
		
		System.out.println("Reverse Array elements");
		for(int index = shopNames.length-1; index >= 0; index--) {
            System.out.println(shopNames[index]);
            		
		}
	     //local variables
		boolean isGood = true;
		if(isGood == true) {
			System.err.println("is good is:"+isGood);
		}
	
	}

}
