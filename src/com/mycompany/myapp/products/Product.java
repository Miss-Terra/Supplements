package com.mycompany.myapp.products;

import com.mycompany.myapp.info.Info;
import com.mycompany.myapp.views.DefaultView;

public class Product implements DefaultView {
	protected String name;


	protected String doseUnit;
	protected String doseThreshold;
	protected String doseLight;
	protected String doseCommon;
	protected String doseStrong;
	protected String doseHeavy;
	
	
	protected String totalDuration;
	protected String onset;
	protected String eliminationHalfLife;
	protected String peak;
	protected String offset;

	
	
	
	public String getName() {
		return name;
	}
}
