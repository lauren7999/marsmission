package marsmission;

public class BARModel<PayloadModel> {
	
	/*
	 * Class Instance Variable
	 * 
	 */
	
	private PayloadModel	         payload;
	private EnginesModel  		     sls;		//null if nt used
	private StageAdapterModel       stageAdapter; //null if not used
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	
	
	
	/*
	 * Constructors
	 * 
	 */
	
	
	public BARModel(marsmission.PayloadModel payload2, EnginesModel coreStages, Engines engines, StageAdapterModel stageAdapter2) {
		this.payload = payload;
		this.Engines = engines;
		this.stageAdapter = stageAdapter2;
		
		
	}

}
