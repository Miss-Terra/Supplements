package com.mycompany.myapp.products.drugs.depressants;

import com.mycompany.myapp.catagories.neurotransmitters.acetylcholine.nicotinic.positive_allosteric_modulator.NicotinicPositiveAllostericModulator;
import com.mycompany.myapp.catagories.neurotransmitters.dopamine.releasing_agent.DopamineReleasingAgent;
import com.mycompany.myapp.catagories.neurotransmitters.gaba.gabaa.positive_allosteric_moderator.GABAa_PositiveAllostericModerator;
import com.mycompany.myapp.catagories.neurotransmitters.glutamate.ampa.negative_allosteric_modulator.AMPA_NegativeAllostericModulator;
import com.mycompany.myapp.catagories.neurotransmitters.glutamate.nmda.negative_allosteric_modulator.NMDA_NegativeAllostericModulator;
import com.mycompany.myapp.products.drugs.Drug;

public class Alcohol extends Drug implements NMDA_NegativeAllostericModulator, GABAa_PositiveAllostericModerator, AMPA_NegativeAllostericModulator, NicotinicPositiveAllostericModulator, DopamineReleasingAgent {

    public Alcohol() {
        
    }

}
// https://en.wikipedia.org/wiki/Alcohol_(drug)#Pharmacodynamics
// https://psychonautwiki.org/wiki/Alcohol
// 