/**
 * The SingleFamilyHome class is used to instantiate SingleFamilyHome objects. This class extends the Residential class which extends the Building class.
 * 
 * @Author  Spencer Childers
*/
public class SingleFamilyHome extends Residential {
	private boolean garage;
	
	
	
	/**
	 * This is an empty constructor for creating SingleFamilyHome objects which initializes
	 * all of the following variables to the empty/zero/false values.
	 */
	public SingleFamilyHome() {
		super();
		garage=false;
	}
	
	
	
	/**
	 * This is the desired constructor for creating SingleFamilyHome objects.
	 * @param projectName  The name of the project.
	 * @param completeAddress  The address for the project.
	 * @param totalSquareFeet  The project's total square feet.
	 * @param occupancyGroup  The occupancy group of the project.
	 * @param subgroup  The project's subgroup.
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
	}
	
	
	
	/**
	 * This is a method that prints out the text "Drawing for <class type>"
	 */
	public void draw() {
		System.out.println("\t\t<<<<<<Drawing code for " + this.getClass() + ">>>>>>\n");
	}

	
	
	/**
	 * This is a method, that when called, prints out all of the object's
	 * characteristics.
	 */
	public String displayData() {
		return line + "\n\tApartment\n" + "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms + "\nLaundry Room Present: " + laundryRoom + "\nGarage Available: " + garage + "\n" + line;
	}
	
	
	
	//Start of Getters/Setters
	
	/**
	 * This is the getter for whether or not there is a garage present on the property.
	 * @return garage  This returns "true" if there is a garage present, "false" if not.
	 */
	public boolean isGarage() {
		return garage;
	}
	/**
	 * This is the setter for whether or not there is a garage present.
	 * @param garage  This is the only parameter for the setGarage method.
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//End of Getters/Setters

	
	
	/**
	 * This method is used to convert the SingleFamilyHome class into string format when called upon.
	 */
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}	
}
