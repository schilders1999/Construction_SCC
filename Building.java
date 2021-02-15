
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
		
	}
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		projectName = "Gaines House";
		completeAddress = "123 Main Street, Louisville, Kentucky 40201";
		totalSquareFeet = 2450;
		occupancyGroup = "Business";
		subgroup = "Group B";
	}
	
	public void draw() {
		System.out.println("Drawing code for Building");
	}
	
	public String displayData() {
		String feet = String.valueOf(totalSquareFeet);
		System.out.println("Project Name: " + projectName);
		System.out.println("Project Address: " + completeAddress);
		System.out.println("Project Square Feet: " + feet);
		System.out.println("Project Occupancy Group: " + occupancyGroup);
		System.out.println("Project Subgroup: " + subgroup);
	}
}
