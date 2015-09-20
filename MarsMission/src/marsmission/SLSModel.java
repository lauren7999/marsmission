package marsmission;

public class SLSModel {
	
	/*
	 * Class Instance Variable
	 * 
	 */
	
	SRBModel[]         solidFuelRockets;  //stage 1 //array stores object; you still need to create the object to have it useble
	MainEngineModel    mainEngine;          // stage 2
	ICPSModel          icps;			  //stage 3
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final int SRB_ENGINES = 2;
	
	
	/*
	 * constructors
	 * 
	 */
	

	public SLSModel() {
		solidFuelRockets   = new SRBModel[SRB_ENGINES];
		
		for(int index = 0; index < SRB_ENGINES; index++) {
			solidFuelRockets[index] = new SRBModel();
		}
		
		mainEngine = new MainEngineModel();
	}

}
