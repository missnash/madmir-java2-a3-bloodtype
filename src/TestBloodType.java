
public class TestBloodType {

	public static void main(String[] args) {
		BloodType junior = new BloodType ("B", '-');
		BloodType ashley = new BloodType();
		BloodType keith = new BloodType("AB");
		BloodType clyde = new BloodType('-');
		
		junior.setBloodType("A");
		junior.setRhFactor('+');
		
		System.out.println("Junior's blood type is " + junior.getBloodType() + junior.getRhFactor());
		System.out.println("Ashley's blood type is " + ashley.getBloodType() + ashley.getRhFactor());
		System.out.println("Keith's blood type is " + keith.getBloodType() + keith.getRhFactor());
		System.out.println("Clyde's blood type is " + clyde.getBloodType() + clyde.getRhFactor());

	}

}
