package in.nit.workshop;

public class Brands {
	
	public static void main(String args[]) {
		
		String brands[] = {"Boat","Noise","Hammer","JBL"};
		System.out.println("length:"+brands.length);
		System.out.println("Array elements");
		for(int index = 0; index < brands.length; index++) {
            System.out.println(brands[index]);
		}
		
		for(int index = brands.length-1; index >= 0; index--) {
            System.out.println(brands[index]);
            		
		}

        int num[] = {10,12,20};
        int sum = num[0]+num[1]+num[2];
        System.out.print("Sum of array is:"+sum);
		
	}

}
