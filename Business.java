/*
 * @author Joshua Henderson
 */
public class Business extends Building {
	protected int numRentableUnits;

	public Business() {
		super();
		numRentableUnits = 0;
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		projectName = "MCM";
		completeAddress = "462 S 4th St #2600,Louisville,Ky,40202";
		totalSquareFeet = 10623;
		occupancyGroup = "Business";
		subgroup = "Group B";
		numRentableUnits = 4;
	}

	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}

	public void drawBusiness() {
		System.out.println("Drawing code for Business");
	}

	public String displayData() {
		return "Project name:" + projectName +  '\n' + "Complete Address:" + completeAddress +  '\n' + "Total square feet:"
				+ totalSquareFeet +  '\n' + "Occupancy group:" + occupancyGroup +  '\n' + "Sub group:" + subgroup
				+ '\n' +  "Number of Rentable Units:" + numRentableUnits;
	}
}
