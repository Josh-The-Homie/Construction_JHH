/*
 * @author Joshua Henderson
 */
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	public Mall() {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0;
		numParkingSpaces = 0;
	}

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		projectName = "St Mathews";
		completeAddress = "123 Main Street";
		totalSquareFeet = 324523;
		occupancyGroup = "Mercantile";
		subgroup = "Group M";
		numRentableUnits = 2;
		numRentedUnits = 1;
		medianUnitSize = 20;
		numParkingSpaces = 1;
	}

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	public void drawMall() {
		System.out.println("Drawing code for Mall");
	}

	public String displayDataMall() {
		return "Project name: " + projectName +  '\n' + "Complete Address:" + completeAddress + '\n' +  "Total square feet:"
				+ totalSquareFeet +  '\n' + "Occupancy group:" + occupancyGroup +  '\n' + ",Sub group:" + subgroup
				+ '\n' +  "Number of Rentable Units:" + numRentableUnits + '\n' +  "Number of rented units:" + numRentedUnits
				+  '\n' + "Median Unit Size:" + medianUnitSize + '\n' +  "Number of Parking spaces:" + numParkingSpaces;
	}
}
