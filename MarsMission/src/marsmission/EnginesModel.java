package marsmission;

public class EnginesModel {
	
	/*
	 * Class Instance Variable
	 * 
	 */
	
	private SRBModel[]         solidFuelRockets;  //stage 1 //array stores object; you still need to create the object to have it useble
	private MainEngineModel    mainEngine;          // stage 2
	private Stage3EngineModel         icps;			  //stage 3
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final int SRB_ENGINES = 2;
	
	
	/*
	 * constructors
	 * 
	 */
	

	public EnginesModel() {
		solidFuelRockets   = new SRBModel[SRB_ENGINES];
		
		for(int index = 0; index < SRB_ENGINES; index++) {
			solidFuelRockets[index] = new SRBModel();
		}
		
		mainEngine = new MainEngineModel();
	}

}
