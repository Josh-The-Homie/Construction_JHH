/*
 * @author Joshua Henderson
 */
public class SingleFamilyHome extends Residential {
private boolean garage;

public boolean isGarage() {
	return garage;
}

@Override
public String toString() {
	return "SingleFamilyHome [garage=" + garage + "]";
}

public void setGarage(boolean garage) {
	this.garage = garage;
}
public SingleFamilyHome(){
	super();
	garage=false;
}
public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
		String subgroup) {
	projectName = "Lakewood Apartments";
	completeAddress = "123 2nd Main Street";
	totalSquareFeet = 3245123;
	occupancyGroup = "Residential";
	subgroup = "Groups R-1, R-2, R-3, & R-4";
	numBedrooms = 3;
	numBathrooms = 2;
	laundryRoom = true;
	garage=true;
	
}
public String displayDataSingleFamilyHome() {
	return "Project name: " + projectName + '\n' + "Complete Address:" + completeAddress + '\n'
			+ "Total square feet:" + totalSquareFeet + '\n' + " Occupancy group:" + occupancyGroup + '\n'
			+ "Sub group:" + subgroup + '\n' + "Number of Bedrooms:" + numBedrooms + '\n' + "Number of Bathrooms:" + numBathrooms + '\n'
			+ "Has a Laundry room:" + laundryRoom+'\n' + "Has a Garage:"+garage;
}
public void drawSingleFamilyHome() {
	System.out.println("Drawing code for SingleFamilyHome");
}
}
