package com.mycompany.myapp.products.supplements.nootropics;

public class Aniracetam extends Nootropic {
	
	
	public Aniracetam() {
		name = this.getClass().getSimpleName();
		this.doseThreshold = "350-500";
		this.doseLight = "500-1200";
		this.doseCommon = "1200-1800";
		this.doseStrong = "1800-2400";
		this.doseHeavy = "2400+";
		this.doseUnit = "mg";
		
	}
	
	

}
