
public class BloodType {
	
	private String bloodType;
	private char rhFactor;
	
	//Constructors
	public BloodType(String newBloodType, char newRHFactor) {
		bloodType = newBloodType;
		rhFactor = newRHFactor;
	}
	
	public BloodType(String newBloodType) {
		this(newBloodType, '+');
	}
	
	public BloodType(char newRhFactor) {
		this("O", newRhFactor);
	}
	
	public BloodType() {
		this("O", '+');
	}
	
	//Accessor methods
	public String getBloodType() {
		return bloodType;
	}
	
	public char getRhFactor() {
		return rhFactor;
	}
	
	//Mutator methods
	public void setBloodType(String blood) {
		bloodType = blood;
	}
	
	public void setRhFactor(char rh) {
		rhFactor = rh;
	}
	
}
