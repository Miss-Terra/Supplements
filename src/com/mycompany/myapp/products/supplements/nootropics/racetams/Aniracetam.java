package com.mycompany.myapp.products.supplements.nootropics.racetams;

import com.mycompany.myapp.products.supplements.nootropics.Nootropic;

public class Aniracetam extends Nootropic {
	
	
	public Aniracetam() {
		name = this.getClass().getSimpleName();
		this.doseThreshold = "350-500";
		this.doseLight = "500-1200";
		this.doseCommon = "1200-1800";
		this.doseStrong = "1800-2400";
		this.doseHeavy = "2400+";
		this.doseUnit = "mg";
		
        this.totalDuration = "3-5h";
        this.onset = "20-90m";
        this.peak = "";
        this.offset = "";
        this.eliminationHalfLife = "1-2.5h";
	}

}
// https://psychonautwiki.org/wiki/Aniracetam
// https://nootriment.com/aniracetam-half-life/
