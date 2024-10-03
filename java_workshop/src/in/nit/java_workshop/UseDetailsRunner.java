package in.nit.java_workshop;

public class UseDetailsRunner {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		//create object
		UserDetails parwez = new UserDetails();
		System.out.println("user details:"+parwez);
		parwez.userId = 12;
		parwez.userName = "parwez";
		parwez.age = 21;
		parwez.gender = "male";
		parwez.dateOfBirth = "30/11/2003";
		parwez.userEmailId = "parwezbaig67@gmail.com";
		parwez.password = "open";
		System.out.println("userId:"+parwez.userId);
		System.out.println("userName:"+parwez.userName);
		System.out.println("age:"+parwez.age);
		System.out.println("gender:"+parwez.gender);
		System.out.println("dateOfBirth:"+parwez.dateOfBirth);
		System.out.println("userEmailId:"+parwez.userEmailId);
		System.out.println("password:"+parwez.password);
        		

	}

}
