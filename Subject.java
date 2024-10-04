package in.nit.workshop;

public class Subject {

	//properties of subject
	public String subjectName;
	public String subjectCode;
	
	//constructor
	public Subject() {
	   System.out.println("default constructor");
	}
	
	//instance methods
	public void getSubjectDetails() {
		System.out.println("this is subject ");
		
		}
	//instance methods
		public void getSubjectDetails(String subjectName) {
			System.out.println("this is subject ");
			System.out.println("subject is:"+subjectName);
			
		}
		public void getSubjectDetail(String subjectCode) {
			System.out.println("subject code is:"+subjectCode);
			
		}
	  
	//to get the length of the given subject
		public void getNumberOfChar(String subjectName) {
			System.out.println("finding the char count");
			System.out.println("subject char:"+subjectName.length());
		}
		//to get the length of the given subject code
				public void getlengthOfChar(String subjectCode) {
					System.out.println("finding the char length");
					System.out.println("subject code char:"+subjectCode.length());
				}


	
}
