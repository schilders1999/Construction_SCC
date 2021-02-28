/**
 * The Apartment class is used to instantiate Apartment objects. This class extends the Residential class which extends the Building class.
 * 
 * @Author  Spencer Childers
*/
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	
	
	/**
	 * This is an empty constructor for creating Apartment objects which initializes
	 * all of the following variables to the empty/zero/false values.
	 */
	public Apartment() {
		super();
		numRentableUnits=0;
		avgUnitSize=0;
		parkingAvailable=false;
	}
	
	
	
	/**
	 * This is the desired constructor for creating Apartment objects.
	 * @param projectName  The name of the project.
	 * @param completeAddress  The address for the project.
	 * @param totalSquareFeet  The project's total square feet.
	 * @param occupancyGroup  The occupancy group of the project.
	 * @param subgroup  The project's subgroup.
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
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
		return line + "\n\tApartment\n" + "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms + "\nLaundry Room Present: " + laundryRoom + "\nNumber of Rentable Units: " + numRentableUnits + "\nAverage Unit Size: " + avgUnitSize + "\nParking is Present: " + parkingAvailable + "\n" + line;
	}
	
	
	
	//Start of Getters/Setters.
	
	/**
	 * This is the getter for the number of rentable units in the project.
	 * @return numRentableUnits  This returns the number of rentable units.
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	/**
	 * This is the setter for the number of rentable units in the project.
	 * @param numRentableUnits  This is the only parameter for the setNumRentableUnits method.
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	
	/**
	 * This is the getter for the average unit size.
	 * @return avgUnitSize  This returns the average unit size.
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	/**
	 * This is the setter for the average unit size.
	 * @param avgUnitSize  This is the only parameter for the setAvgUnitSize method.
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	
	/**
	 * This is the getter for whether or not parking is available.
	 * @return parkingAvailable  This returns "true" if there is parking available, "false" if not.
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	/**
	 * This is the setter for whether or not parking is available.
	 * @param parkingAvailable  This is the only parameter for the setParkingAvailable method.
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//End of Getters/Setters

	
	
	/**
	 * This method is used to convert the Apartment class into string format when called upon.
	 */
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}	
}
