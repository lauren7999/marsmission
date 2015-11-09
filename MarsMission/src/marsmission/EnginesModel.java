package marsmission;

public class EnginesModel {
	
	/*
	 * Class Instance Variable
	 * 
	 */
	
	private SRBModel[]         solidFuelRockets;  //stage 1 //array stores object; you still need to create the object to have it useble
	private MainEngineModel    mainEngine;          // stage 2
	private SLSICPSEngineModel         icps;			  //stage 3
	private int type;
	private String organization;
	
	
	/*
	 * Class Constants
	 * 
	 */
	public static final int BOOSTER_ENGINE = 1;
	public static final int MAIN_ENGINE = 2;
	public static final int  STAGE3_ENGINE  =3;
	
	public static final String []   ENGINE_TYPES  = {"Booster Engine", "Main Engine", "Stage 3 Engines"};
	
	//getters
	
	public SRBModel[] getSolidFuelRockets() {
		return solidFuelRockets;
	}

	public MainEngineModel getMainEngine() {
		return mainEngine;
	}

	public SLSICPSEngineModel getIcps() {
		return icps;
	}

	public int getType() {
		return type;
	}

	public String getOrganization() {
		return organization;
	}

	public static int getBoosterEngine() {
		return BOOSTER_ENGINE;
	}


	public static int getStage3Engine() {
		return STAGE3_ENGINE;
	}

	
	/*
	 * constructors
	 * 
	 */
	

	public EnginesModel(int type, String model, String organization) {
		this.type    = type;
		this.organization   = model;
		this.organization = organization;
	}

	
	/*
	 * Ignition
	 * 
	 */
	
	public boolean ignition() {
		boolean ignited = false;
		
		System.out.println(ENGINE_TYPES[type - 1] + "ignition...");
		return ignited;
	}
	
}
