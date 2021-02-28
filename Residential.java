/**
 * The Residential class is used to instantiate Residential objects. This class extends the Building class.
 * 
 * @Author  Spencer Childers
*/
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	
	
	/**
	 * This is an empty constructor for creating Residential objects which initializes
	 * all of the following variables to the empty/zero/false values.
	 */
	public Residential() {
		super();
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
	}
	
	
	
	/**
	 * This is the desired constructor for creating Residential objects.
	 * @param projectName  The name of the project.
	 * @param completeAddress  The address for the project.
	 * @param totalSquareFeet  The project's total square feet.
	 * @param occupancyGroup  The occupancy group of the project.
	 * @param subgroup  The project's subgroup.
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
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

	
	
	//Start of Getters/Setters.
	
	/**
	 * This is the getter for the number of bedrooms in the project.
	 * @return numBedrooms  Returns the number of bedrooms.
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}
	/**
	 * This is the setter for the number of bedrooms in the project.
	 * @param numBedrooms  This is the only parameter in the setNumBedrooms method.
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	
	/**
	 * This is the getter for the number of bathrooms in the project.
	 * @return numBathrooms  This returns the number of bathrooms.
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}
	/**
	 * This is the setter for the number of bathrooms in the project.
	 * @param numBathrooms  This is the only parameter in the setNumBathrooms method.
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	
	/**
	 * This is the getter for whether or not there is a laundry room present in the project.
	 * @return laundryRoom  This returns "true" if there is a laundry room present, "false" if not.
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}
	/**
	 * This is the setter for whether or not there is a laundry room present in the project.
	 * @param laundryRoom  This is the only parameter in the setLaundryRoom method.
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//End of Getters/Setters.

	
	
	/**
	 * This method is used to convert the Residential class into string format when called upon.
	 */
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}
}
