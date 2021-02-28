/**
 * This is an application used to display the different characteristics of various building structures.
 * 
 * @author  Spencer Childers
 * @since  2021-02-28
 *
 */
public class ApplicationC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				//XXXXXXXXX Building Class Tests XXXXXXXXX
		
		//Creating a Building object with empty constructor.
		Building Build0 = new Building();
		
		//Using draw method to title what type of code is being drawn.
		Build0.draw();
		
		//Using toString method for empty constructor.
		System.out.println(Build0.toString() + "\n");
				
		//Constructing Building object.
		Building Build1 = new Building("Gaine's Property", "3421 Cornerstone Road, Slancing, Smichigan", 3500, "Residential", "R-1");
				
		//Testing toString method for Building object.
		System.out.println(Build1 + "\n");
		
		//Displaying data for Building object with displayData().
		System.out.println(Build1.displayData()+"\n");
		
		//Testing setters by inserting new values for each variable.
		System.out.println("\t\t||Next, Displaying Updated Data for Building||\n");
		Build1.setProjectName("|Set| Gaine's Property");
		Build1.setCompleteAddress("|Set| 3421 Cornerstone Road, Slancing, Smichigan");
		Build1.setTotalSquareFeet(4000);
		Build1.setOccupancyGroup("|Set| Residential");
		Build1.setSubgroup("|Set| R-1");
		
		//Displaying data for Building object inserted through setters.
		System.out.println(Build1.displayData()+"\n\n");
		
		//Testing getters for Building object.
		System.out.println("\t\tXXX  Testing Getters  XXX");
		System.out.println("\n" + Build1.getClass() +"\nComplete Address: " + Build1.getCompleteAddress() + "\nOccupancy Group: " + Build1.getOccupancyGroup() + "\nProject Name: " + Build1.getProjectName() + "\nSubgroup: " + Build1.getSubgroup() + "\nSquare Feet: " + Build1.getTotalSquareFeet() + "\n\n\n\n\n\n\n\n");
		
		
		
		
				//XXXXXXXXX Business Class Tests XXXXXXXXX
				
		//Creating a Business object with empty constructor.
		Business Bus0 = new Business();
		
		//Using draw method to title what type of code is being drawn.
		Bus0.draw();
		
		//Using toString method for empty constructor.
		System.out.println(Bus0.toString() + "\n");
				
		//Constructing Business object.
		Business Bus1 = new Business("Eclipse Project", "891 Tarquin Road, Flexington, Fentucky", 2500, "Business" , "B");
		
		//Testing toString method for Business object.
		System.out.println(Bus1 + "\n");
		
		//Testing setters by inserting new values for each variable.
		System.out.println("\t\t||Next, Displaying Updated Data for Business||\n");
		Bus1.setCompleteAddress("|Set| 891 Tarquin Road, Flexington, Fentucky");
		Bus1.setNumRentableUnits(1);
		Bus1.setOccupancyGroup("|Set| Business");
		Bus1.setProjectName("|Set| Eclipse Project");
		Bus1.setSubgroup("|Set| B");
		Bus1.setTotalSquareFeet(3000);
		
		//Displaying data for Business object inserted through setters.
		System.out.println(Bus1.toString()+"\n\n");
		
		//Testing getters for Business object.
		System.out.println("\t\tXXX  Testing Getters  XXX");
		System.out.println("\n" + Bus1.getClass() + "\nComplete Address: " + Bus1.getCompleteAddress() + "\nNumber of Rentable Units: " + Bus1.getNumRentableUnits() + "\nOccupancy Group: " + Bus1.getOccupancyGroup() + "\nProject Name: " + Bus1.getProjectName() + "\nSubgroup: " + Bus1.getSubgroup() + "\nTotal Square Feet: " + Bus1.getTotalSquareFeet() + "\n\n\n\n\n\n\n\n");
		
		
		
		
		
				//XXXXXXXXX Mall Class Tests XXXXXXXXX
				
		//Creating a Mall object with empty constructor.
		Mall Mall0 = new Mall();
				
		//Using draw method to title what type of code is being drawn.
		Mall0.draw();
		
		//Using toString method for empty constructor.
		System.out.println(Mall0.toString() + "\n");
				
		//Constructing Mall object.
		Mall Mall1 = new Mall("Lumborg Mall", "643 Forge Road, Malaska", 45300 , "Business", "B");
	
		//Testing toString method for Mall object.
		System.out.println(Mall1 + "\n");
		
		//Displaying data for Mall object with displayData().
		System.out.println(Mall1.displayData() + "\n");
		
		//Testing setters by inserting new values for each variable.
		System.out.println("\t\t||Next, Displaying Updated Data for Mall||\n");
		Mall1.setProjectName("|Set| Lumborg Mall");
		Mall1.setCompleteAddress("|Set| 643 Forge Road, Malaska");
		Mall1.setTotalSquareFeet(50000);
		Mall1.setOccupancyGroup("|Set| Business");
		Mall1.setSubgroup("|Set| B");
		Mall1.setNumRentableUnits(2);
		Mall1.setNumRentedUnits(1);
		Mall1.setMedianUnitSize(48000.3);
		Mall1.setNumParkingSpaces(566);
		
		//Displaying data for Mall object inserted through setters.
		System.out.println(Mall1.displayData()+"\n\n");
		
		//Testing getters for Mall object.
		System.out.println("\t\tXXX  Testing Getters  XXX");
		System.out.println("\n" + Mall1.getClass() + "\nComplete Address: " + Mall1.getCompleteAddress() + "\n Median Unit Size: " + Mall1.getMedianUnitSize() + "\nNumber of Parking Spaces: " + Mall1.getNumParkingSpaces() + "\nNumber of Rentable Units: " + Mall1.getNumRentableUnits() + "\nNumber of Rented Units: " + Mall1.getNumRentedUnits() + "\nOccupancy Group: " + Mall1.getOccupancyGroup() + "\nProject Name: " + Mall1.getProjectName() + "\nSubgroup: " + Mall1.getSubgroup() + "\nTotal Square Feet: " + Mall1.getTotalSquareFeet() + "\n\n\n\n\n\n\n\n");
		
		
		
		
				//XXXXXXXXX Residential Class Tests XXXXXXXXX
				
		//Creating a Residential object with empty constructor.
		Residential Res0 = new Residential();
				
		//Using draw method to title what type of code is being drawn.
		Res0.draw(); 
		
		//Using toString method for empty constructor.
		System.out.println(Res0.toString() + "\n");
		
		//Constructing Residential Object.
		Residential Res1 = new Residential("Liza's Estate", "182 Lazy River Road, Polumbus, Pohio", 3450, "Residential", "R-3");
		
		//Testing toString method for Residential object.
		System.out.println(Res1 + "\n");
		
		//Testing setters by inserting new values for each variable.
		System.out.println("\t\t||Next, Displaying Updated Data for Residential||\n");
		Res1.setCompleteAddress("|Set| 182 Lazy River Road, Polumbus, Pohio");
		Res1.setLaundryRoom(true);
		Res1.setNumBathrooms(3);
		Res1.setNumBedrooms(2);
		Res1.setOccupancyGroup("|Set| Residential");
		Res1.setProjectName("|Set| Liza's Estate");
		Res1.setSubgroup("|Set| R-3");
		Res1.setTotalSquareFeet(3600.0);
		
		//Displaying data for Business object inserted through setters.
		System.out.println(Res1.toString()+"\n\n");
		
		//Testing getters for Residential object.
		System.out.println("\t\tXXX  Testing Getters  XXX");
		System.out.println("\n" + Res1.getClass() + "Complete Address: " + Res1.getCompleteAddress() + "\nNumber of Bathrooms: " + Res1.getNumBathrooms() + "\nNumber of Bedrooms: " + Res1.getNumBedrooms() + "\nOccupancy Group: " + Res1.getOccupancyGroup() + "\nProject Name: " + Res1.getProjectName() + "\nSubgroup: " + Res1.getSubgroup() + "\nTotal Square Feet: " + Res1.getTotalSquareFeet() + "\n\n\n\n\n\n\n\n");
				
		
		
		
				//XXXXXXXXX Apartment Class Tests XXXXXXXXX
				
		//Creating an Apartment object with empty constructor.
		Apartment Apart0 = new Apartment();
		
		//Using draw method to title what type of code is being drawn.
		Apart0.draw();
		
		//Using toString method for empty constructor.
		System.out.println(Apart0.toString() + "\n");
		
		//Constructing Apartment Object.
		Apartment Apart1 = new Apartment("Solid Oak Apartments", "2400 Cornrow Street, Wheonix, Warizona", 1600, "Residential", "R-2");
		
		//Testing toString method for Apartment object.
		System.out.println(Apart1 + "\n");
		
		//Displaying data for Apartment object with displayData().
		System.out.println(Apart1.displayData() + "\n");
		
		//Testing setters by inserting new values for each variable.
		System.out.println("\t\t||Next, Displaying Updated Data for Apartment||\n");
		Apart1.setAvgUnitSize(1570);
		Apart1.setCompleteAddress("|Set| 2400 Cornrow Street, Wheonix, Warizona");
		Apart1.setLaundryRoom(true);
		Apart1.setNumBathrooms(1);
		Apart1.setNumBedrooms(1);
		Apart1.setNumRentableUnits(8);
		Apart1.setOccupancyGroup("|Set| Residential");
		Apart1.setParkingAvailable(true);
		Apart1.setProjectName("|Set| Solid Oak Apartments");
		Apart1.setSubgroup("|Set| R-2");
		Apart1.setTotalSquareFeet(1620);
		
		//Displaying data for Apartment object inserted through setters.
		System.out.println(Apart1.displayData()+"\n\n");
		
		//Testing getters for Apartment object.
		System.out.println("\t\tXXX  Testing Getters  XXX");
		System.out.println("\n" + Apart1.getClass() + "Complete Address: " + Apart1.getCompleteAddress() + "\nNumber of Bathrooms: " + Apart1.getNumBathrooms() + "\nNumber of Bedrooms: " + Apart1.getNumBedrooms() + "\nOccupancy Group: " + Apart1.getOccupancyGroup() + "\nProject Name: " + Apart1.getProjectName() + "\nSubgroup: " + Apart1.getSubgroup() + "\nTotal Square Feet: " + Apart1.getTotalSquareFeet() + "\nNumber of Rentable Units: " + Apart1.getNumRentableUnits() + "\nAverage Unit Size: " + Apart1.getAvgUnitSize() + "\nParking is Available: " + Apart1.isParkingAvailable() + "\n\n\n\n\n\n\n\n");
		
		
		
		
				//XXXXXXXXX SingleFamilyHome Class Tests XXXXXXXXX
						
		//Creating a SingleFamilyHome object with empty constructor.
		SingleFamilyHome Sing0 = new SingleFamilyHome();
		
		//Using draw method to title what type of code is being drawn.
		Sing0.draw();
		
		//Using toString method for empty constructor.
		System.out.println(Sing0.toString() + "\n");
		
		//Constructing SingleFamilyHome object.
		SingleFamilyHome Sing1 = new SingleFamilyHome("Dreves' Home", "308 Greenfields Lane, PLankfort, Pentucky", 2300, "Residential", "R-4");
		
		//Testing toString method for SingleFamilyHome object.
		System.out.println(Sing1 + "\n");
		
		//Displaying data for SingleFamilyHome object with dispayData().
		System.out.println(Sing1.displayData() + "\n");
		
		//Testing setters by inserting new values for each variable.
		System.out.println("\t\t||Next, Displaying Updated Data for Single Family Home||\n");
		Sing1.setCompleteAddress("|Set| 308 Greenfields Lane, PLankfort, Pentucky");
		Sing1.setGarage(true);
		Sing1.setLaundryRoom(true);
		Sing1.setNumBathrooms(2);
		Sing1.setNumBedrooms(2);
		Sing1.setOccupancyGroup("|Set| Residential");
		Sing1.setProjectName("|Set| Dreves' Home");
		Sing1.setSubgroup("|Set| R-4");
		Sing1.setTotalSquareFeet(2400);
		
		//Displaying data for SingleFamilyHome object inserted through setters.
		System.out.println(Sing1.displayData()+"\n\n");
		
		//Testing getters for SingleFamilyHome object.
		System.out.println("\t\tXXX  Testing Getters  XXX");
		System.out.println("\n" + Sing1.getClass() + "Complete Address: " + Sing1.getCompleteAddress() + "\nNumber of Bathrooms: " + Sing1.getNumBathrooms() + "\nNumber of Bedrooms: " + Sing1.getNumBedrooms() + "\nOccupancy Group: " + Sing1.getOccupancyGroup() + "\nProject Name: " + Sing1.getProjectName() + "\nSubgroup: " + Sing1.getSubgroup() + "\nTotal Square Feet: " + Sing1.getTotalSquareFeet() + "\nGarage is Available: " + Sing1.isGarage() + "\n\n\n\n\n\n\n\n");
		
	}

}
