package in.nit.workshop;

public class arrayElements {
	
	public static void main(String args[]) {
		//declare array
		String names[] = {"Bharath","Sunil","Sumit","Vidyadhar"};
		int[] numbers = {1,3,4,6};
		char [] ch = {'A','B','C'};
		System.out.println("names:"+names.length);
		System.out.println("numbers:"+numbers.length);
		System.out.println("ch:"+ch.length);
		
		//display array elements
		System.out.println("displaying array elements");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		
	}

}
