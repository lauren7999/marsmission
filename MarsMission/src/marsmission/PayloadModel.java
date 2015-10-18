package marsmission;

import javax.swing.Icon;

public class PayloadModel {
	
	/*
	 * Class Instance Variables
	 * 
	 */
	

	private LaunchAbortSystemModel     launchAbortSystemModel;
	private CrewModuleModel				crewModule;
	private ServiceModuleModel			serviceModule;
	private ServiceModulePanelsModel    serviceModulePanels;
	private StageAdapterModel      spacecraftAdapter;
	private Stage3Model                   icps;
	
	
	
	/*
	 * Class Constants
	 * 
	 */

	
	/*
	 * Constructors
	 * 
	 */
	

	public PayloadModel(LaunchAbortSystemModel launchAbortSystem, CrewModuleModel crewmodule, ServiceModuleModel serviceModule, ServiceModulePanelsModel serviceModulePanels, Space) {
		launchAbortSystemModel   = new LaunchAbortSystemModel();
		this.crewModule          = new CrewModuleModel ( MODEL, ORGANIZATION, CREW);
		serviceModule            = new ServiceModuleModel();
		serviceModulePanels      = new ServiceModulePanelsModel();
		spacecraftAdapter        = new StageAdapterModel();
		SRBModel Stage3Model = new SRBModel();
	}




	public PayloadModel(LaunchAbortSystemModel launchAbortSystem, CrewModuleModel crewModule2,
			ServiceModuleModel serviceModule2, ServiceModuleModel service, Object spacecraftAdapter2) {
		// TODO Auto-generated constructor stub
	}}
