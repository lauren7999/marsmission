package marsmission;

public class CrewModuleModel {

	/*
	 * Class Instance Variable
	 * 
	 */
	
	public String model;
	private String organization;
	private int    crewMembers;
	/*
	 * Class Constants
	 * 
	 */
	
	
	/*
	 * constructors
	 * 
	 */
	
	public CrewModuleModel(String model, String organization, int crewMembers) {
		this.model 			  = model;
		this.organization     = organization;
		this.crewMembers      = crewMembers;
	}
	

}
