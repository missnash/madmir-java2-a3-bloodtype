
public class TestPatient {

	public static void main(String[] args) {
		
		//Declare Mark's blood type 
		BloodType markBloodType = new BloodType("AB", '-');
		
		//Patient info and using constructors
		Patient mark = new Patient(121212, 55, markBloodType);
		Patient sam = new Patient();
		Patient dave = new Patient();
		
		sam.setPatientAge(74);
		sam.setPatientIdNumber(584578);
		BloodType samBloodType = new BloodType("A", '+');
		sam.setBloodType(samBloodType);
		
		//Output overloaded constructor 
		System.out.println("Mark's id number is " + mark.getPatientIdNumber());
		System.out.println("Mark's age is " + mark.getPatientAge());
		System.out.println("Mark's blood type is " + mark.getBloodType());
		
		//Output use mutators to change constructors 
		System.out.println("Sam's id number is " + sam.getPatientIdNumber());
		System.out.println("Sam's age is " + sam.getPatientAge());
		System.out.println("Sam's blood type is " + sam.getBloodType());
		
		//Output default constructor
		System.out.println("Dave's id number is " + dave.getPatientIdNumber());
		System.out.println("Dave's age is " + dave.getPatientAge());
		System.out.println("Dave's blood type is " + dave.getBloodType());
		

	}

}
