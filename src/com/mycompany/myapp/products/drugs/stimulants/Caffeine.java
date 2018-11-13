package com.mycompany.myapp.products.drugs.stimulants;

import com.mycompany.myapp.catagories.neurotransmitters.dopamine.releasing_agent.DopamineReleasingAgent;
import com.mycompany.myapp.products.drugs.Drug;

public class Caffeine extends Drug implements DopamineReleasingAgent {
    public Caffeine() {
        name = this.getClass().getSimpleName();
        this.doseThreshold = "10";
        this.doseLight = "20-50";
        this.doseCommon = "50-150";
        this.doseStrong = "150-500";
        this.doseHeavy = "500+";
        this.doseUnit = "mg";    
        
        this.totalDuration = "2-5h";
        this.onset = "5-10m";
        this.peak = "1-2h";
        this.offset = "2-4h";
        this.eliminationHalfLife = "3-7h";
    }
}


//https://psychonautwiki.org/wiki/Caffeine
//https://en.wikipedia.org/wiki/Caffeine