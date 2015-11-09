package marsmission;

public class CrewModuleModel extends PayloadModel{

	/*
	 * Class Instance Variable
	 * 
	 */
		private int      crewMembers;
	
		/*
	 * Class Constants
	 * 
	 */
	
	
	/*
	 * constructors
	 * 
	 */
	
	public CrewModuleModel(int type, String model, String organization, int crewMembers) {


		super(type, model, organization);
		
		this.crewMembers = crewMembers;
	}
}
