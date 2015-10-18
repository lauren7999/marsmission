package marsmission;

public class OrionModel {

	public OrionModel() {
	
		/*
		 * Class Instance Variables
		 * 
		 */
		
		private LaunchAbortSystemModel     launchAbortSystemModel;
		private CrewModuleModel				crewModule;
		private ServiceModuleModel			serviceModule;
		private ServiceModulePanelsModel    serviceModulePanels;
		private SpacecraftAdapterModel      spacecraftAdapter;
		private Stage3Model                   icps;
		
		
		
		/*
		 * Class Constants
		 * 
		 */
		
		public static final String    MODEL          = "Orion";
		public static final String    ORGANIZATION   = "International";
		public static final int       CREW            = 4;
		private static final String ORION_ORGANIZATION = null;
		
		/*
		 * Constructors
		 * 
		 */
		
		public OrionModel(Object ORION_CREW, Object ORION_MODEL) {
			super(ORION_MODEL, ORION_ORGANIZATION, ORION_CREW);
		}
}
