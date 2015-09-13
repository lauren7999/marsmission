package marsmission;

public class SpacecraftModel {

	/*
	 * Class Instance Variable
	 * 
	 */
	
	private int				  maxSpeed;
	private CrewModuleModel   crewModule;
	private LaunchAbortSystemModel  launchAbortSystem;
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	
	/*
	 * constructors
	 * 
	 */
	
	public SpacecraftModel(int maxSpeed, CrewModuleModel crewModule, LaunchAbortSystemModel launchAbortSystem) {
		
		this.maxSpeed                 = maxSpeed;
		this.crewModule               = crewModule;
		this.launchAbortSystem        = launchAbortSystem;
		
	}

}
