package in.nit.workshop;

public class Person {
	//static variables
	public static String country;
    public static String state;
    public static String district;
    public static String taluk;
    
    //instance variables or non static variables
    public String personName;
    public String qualification;
    public int panCardNumber;
    public int aadharCardNumber;
        
    //static methods
    public static void displayInfo() { 
       System.out.println("Display method is Invoked");
      
}
    public static void getInformation() { 
        System.out.println(" Invoking non-static method");
    }        
}

