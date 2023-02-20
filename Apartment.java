/*
 * @author Joshua Henderson
 */
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	public Apartment() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0;
		parkingAvailable = false;
	}

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		projectName = "Lakewood Apartments";
		completeAddress = "123 2nd Main Street";
		totalSquareFeet = 3245123;
		occupancyGroup = "Residential";
		subgroup = "Groups R-1, R-2, R-3, & R-4";
		numRentableUnits = 4;
		avgUnitSize = 2346;
		parkingAvailable = true;
		numBedrooms = 3;
		numBathrooms = 2;
		laundryRoom = true;
	}

	public String displayDataApartment() {
		return "Project name: " + projectName + '\n' + "Complete Address:" + completeAddress + '\n'
				+ "Total square feet:" + totalSquareFeet + '\n' + " Occupancy group:" + occupancyGroup + '\n'
				+ "Sub group:" + subgroup + '\n' + "Number of Rentable Units:" + numRentableUnits + '\n'
				+ "Average Unit Size:" + avgUnitSize + '\n' + "There is parking available:" + parkingAvailable + '\n'
				+ "Number of Bedrooms:" + numBedrooms + '\n' + "Number of Bathrooms:" + numBathrooms + '\n'
				+ "Has a Laundry room:" + laundryRoom;
	}
	public void drawApartment() {
		System.out.println("Drawing code for Apartment");
	}
}
