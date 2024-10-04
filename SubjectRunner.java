package in.nit.workshop;

public class SubjectRunner {

	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.getSubjectDetails();
		subject.getSubjectDetails("Maths");
		subject.getSubjectDetail("21MAT11");
		subject.getNumberOfChar("Maths");
		subject.getlengthOfChar("21MAT11");
	}

}
