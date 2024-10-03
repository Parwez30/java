package in.nit.workshop;

public class PersonRunner {

	public static void main(String[] args) {
		System.out.println("Main method is started");
        Person.country = "India";
		Person.state = "Karnataka";
        Person.district = "Raichur";
        Person.taluk = "Raichur";
		System.out.println("Country is:"+Person.country);
        System.out.println("State is:"+Person.state);
        System.out.println("District is:"+Person.district);
        System.out.println("Taluk is:"+Person.taluk);
        
        Person person = new Person();
        person.personName = "Parwez";
        person.qualification = "Undergraduate";
        person.panCardNumber = 12345;
        person.aadharCardNumber = 56789;
        System.out.println("Person name is:"+person.personName);
        System.out.println("Qualification is:"+person.qualification);
        System.out.println("Pan card number is:"+person.panCardNumber);
        System.out.println("Aadhar card number is:"+person.aadharCardNumber);
        System.out.println("Main method is ended");
        
        Person.displayInfo();
        Person.getInformation();
	}

}
