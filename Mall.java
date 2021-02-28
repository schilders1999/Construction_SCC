/**
 * The Mall class is used to instantiate Mall objects. This class extends the Business class, and further, the Building class.
 * 
 * @Author  Spencer Childers
*/
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	
	
	/**
	 * This is an empty constructor for creating Mall objects which initializes
	 * all of the following variables to the empty/zero values.
	 */
	public Mall() {
		super();
		numRentedUnits=0;
		medianUnitSize=0.0;
		numParkingSpaces=0;
	}
	
	
	
	/**
	 * This is the desired constructor for creating Mall objects.
	 * @param projectName  The name of the project.
	 * @param completeAddress  The address for the project.
	 * @param totalSquareFeet  The project's total square feet.
	 * @param occupancyGroup  The occupancy group of the project.
	 * @param subgroup  The project's subgroup.
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
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
	 * This is a method, that when called, prints out all of the Mall object's
	 * characteristics.
	 */
	public String displayData() {
		return line + "\n\tMall\n" + "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nNumber of Rentable Units: " + numRentableUnits + "\nNumber of Rented Units: " + numRentedUnits + "\nMedian Unit Size: " + medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces + "\n" + line; 
	}
	
	
	
	//Start of Getters/Setters.
	
	/**
	 * This is the getter for the number of rented units.
	 * @return numRentedUnits  This returns the number of rented units.
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	/**
	 * This is the setter for the number of rented units.
	 * @param numRentedUnits  This is the only parameter passed in the setNumRentedUnits method.
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	
	/**
	 * This is the getter for the median unit size.
	 * @return medianUnitSize  This returns the median unit size.
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	/**
	 * This is the setter for the median unit size.
	 * @param medianUnitSize  This is the only parameter passed in the setMedianUnitSize method.
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	
	/**
	 * This is the getter for the number of parking spaces.
	 * @return numParkingSpaces  This returns the number of parking spaces.
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	/**
	 * This is the setter for the number of parking spaces.
	 * @param numParkingSpaces  This is the only parameter passed in the setNumParkingSpaces method.
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//End of Getters/Setters.

	
	
	/**
	 * This method is used to convert the Mall class into string format when called upon.
	 */
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}
}
