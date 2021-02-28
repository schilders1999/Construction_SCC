/**
 * The Building class is used to instantiate building objects.
 * 
 * @Author  Spencer Childers
*/
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	public String line = "===============================================================================";

	
	
	/**
	 * This is an empty constructor for creating Building objects which initializes
	 * all of the following variables to the empty/zero values.
	 */
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}
	
	
	
	/**
	 * This is the desired constructor for creating Building objects.
	 * @param projectName  The name of the project.
	 * @param completeAddress  The address for the project.
	 * @param totalSquareFeet  The project's total square feet.
	 * @param occupancyGroup  The occupancy group of the project.
	 * @param subgroup  The project's subgroup.
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
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
		return line + "\n\tBuilding\n" + "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\n" + line;
	}
	
	
	
	//Start list of Getters/Setters.
	
	/**
	 * This is the getter for the project's name.
	 * @return projectName  This returns the name of the project.
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * This is a setter for the project's name.
	 * @param projectName  This is the only parameter for the getProjectName method.
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	/**
	 * This is the getter for the project's address.
	 * @return completeAddress  This returns the project's address.
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}
	/**
	 * This is the setter for the project's address.
	 * @param completeAddress  This is the only parameter for the setCompleteAddress method.
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	
	/**
	 * This is the getter for the project's total square feet.
	 * @return totalSquareFeet  This returns the projects total square feet.
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}
	/**
	 * This is the setter for the project's total square feet.
	 * @param totalSquareFeet  This is the only parameter for the setTotalSquareFeet method.
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	
	/**
	 * This is the getter for the project's occupancy group.
	 * @return occupancyGroup  This is the project's occupancy group.
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}
	/**
	 * This is the setter for the project's occupancy group.
	 * @param occupancyGroup  This is the only parameter for the setOccupancyGroup method.
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	
	/**
	 * This is the getter for the project's subgroup.
	 * @return subgroup  This is the project's subgroup.
	 */
	public String getSubgroup() {
		return subgroup;
	}
	/**
	 * This is the setter for the project's subgroup.
	 * @param subgroup  This is the only parameter for the setSubgroup method.
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//End of Getters/Setters.
	
	
	
	/**
	 * This method is used to convert the Building class into string format when called upon.
	 */
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
}
