package marsmission;

import javax.swing.Icon;

public class PayloadModel {
	
	/*
	 * Class Instance Variables
	 * 
	 */
	
	protected int type;
	private String model;
	private String organization;
	
	
	/*
	 * Class Constants
	 */
	
	public static final int CREW_PAYLOAD = 1;
	public static final int CARGO_PAYLOAD  =2;
	
	
	/*
	 * Constructors
	 * 
	 */
	
	public PayloadModel(int type, String model2, String organization2) {
		this.type = type;
	}
	



}
