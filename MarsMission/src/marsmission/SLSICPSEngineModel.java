package marsmission;

public class SLSICPSEngineModel extends SLSEngineModel { //icps = fuel tank 
	
	/*
	 * Class instance variables
	 * 
	 */
	
	private LaunchVehicleStageAdapterModel     launchVehicleStageAdapterModel;
	
	/*
	 * Class constants
	 * 
	 */
	
	public static final String  ICPS_ENGINE = "ICPS";
	
	/*
	 * Constructors
	 * 
	 */

	public SLSICPSEngineModel(int type, String model, String organization) {
		// TODO Auto-generated constructor stub
		super(type, model, organization);
		
		launchVehicleStageAdapterModel  = new LaunchVehicleStageAdapterModel();
	}

}
