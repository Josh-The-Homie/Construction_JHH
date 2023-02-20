/*
 * @author Joshua Henderson
 */
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	public Residential() {
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		projectName = "Residential";
		completeAddress = "52345 West Street Louisville Ky";
		totalSquareFeet = 4354;
		occupancyGroup = "Residential";
		subgroup = "Groups R-1, R-2, R-3, & R-4";
		numBedrooms = 3;
		numBathrooms = 2;
		laundryRoom = true;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	public String displayDataResidential() {
		return "Project name:" + projectName + '\n' + "Complete Address:" + completeAddress + '\n'
				+ "Total square feet:" + totalSquareFeet + '\n' + "Occupancy group:" + occupancyGroup + '\n'
				+ "Sub group:" + subgroup + '\n' + "Number of Bedrooms:" + numBedrooms + '\n' + "Number of Bathrooms:"
				+ numBathrooms + '\n' + "Has a Laundry room:" + laundryRoom;
	}

	public void drawResidential() {
		System.out.println("Drawing code for Residential");
	}

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}

}
