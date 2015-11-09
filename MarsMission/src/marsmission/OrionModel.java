package marsmission;

public class OrionModel extends CrewModuleModel {

	
		/*
		 * Class Instance Variables
		 * 
		 */
		
		private LaunchAbortSystemModel                         launchAbortSystemModel;
		private ServiceModulePanelsModel	                   serviceModule;
		private SpacecraftAdapterModel                         spacecraftAdapter;
		
		
		
		/*
		 * Class Constants
		 * 
		 */
		
		public static final String    MODEL          = "Orion";
		public static final String    ORGANIZATION   = "International";
		private static final int       CREW            = 4;
		private static final String ORION_ORGANIZATION = null;
		
		/*
		 * Constructors
		 * 
		 */
		
		public OrionModel() {
			super(getCrew(), ORION_ORGANIZATION, MODEL, PayloadModel.CREW_PAYLOAD);
			
			launchAbortSystemModel = new LaunchAbortSystemModel();
		}

		public boolean launch() {
			// TODO Auto-generated method stub
			return false;
		}

		public static int getCrew() {
			return CREW;
		}
}
