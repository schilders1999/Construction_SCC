/**
 * The Business class is used to instantiate Business objects. This class extends the Building class.
 * 
 * @Author  Spencer Childers
*/
public class Business extends Building {
	protected int numRentableUnits;
	
	
	
	/**
	 * This is an empty constructor for creating Business objects which initializes
	 * all of the following variables to the empty/zero values.
	 */
	public Business() {
		super();
		numRentableUnits=0;
	}
	
	
	
	/**
	 * This is the desired constructor for creating Business objects.
	 * @param projectName  The name of the project.
	 * @param completeAddress  The address for the project.
	 * @param totalSquareFeet  The project's total square feet.
	 * @param occupancyGroup  The occupancy group of the project.
	 * @param subgroup  The project's subgroup.
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
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
	
	
	
	//Start of Getters/Setters for Business
	
	/**
	 * This is the getter for the number of rentable units.
	 * @return numRentableUnits  This returns the number of rentable units.
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	/**
	 * This is the setter for the number of rentable units.
	 * @param numRentableUnits  This is the only parameter for the setNumRentableUnits method.
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//End of Getters/Setters

	
	
	/**
	 * This method is used to convert the Business class into string format when called upon.
	 */
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
}
