/*
 * @author Joshua Henderson
 */
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0;
		occupancyGroup = "";
		subgroup = "";
	}

	public Building(String projectName, String completeAddress, double totalSquarefeet) {
		projectName = "Gaines House";
		completeAddress = "123 Main Street, Louisville, Kentucky 40201";
		totalSquareFeet = 2450;
		occupancyGroup = "Assembly";
		subgroup = " Groups A-1, A-2, A-3, A-4, & A-5";
	}

	public void draw() {
		System.out.println("Drawing code for Building");
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public String displayData() {
		return "Project name:" + projectName + '\n' + "Complete Address:" + completeAddress + '\n' + "Total square feet:"
				+ totalSquareFeet + '\n' + "Occupancy group:" + occupancyGroup + '\n' + "Sub group:" + subgroup;
	}

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}

}
