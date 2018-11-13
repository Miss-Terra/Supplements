package com.mycompany.myapp.views;

import com.mycompany.myapp.products.Product;

public interface DefaultView {

    public default boolean dopamineReleasingAgent(Product p) {
        if (p instanceof com.mycompany.myapp.catagories.neurotransmitters.dopamine.releasing_agent.DopamineReleasingAgent) {
            return true;
        }
        return false;
    }


    
    public default boolean nmdaPositiveAllostericModulator(Product p) {
        if (p instanceof com.mycompany.myapp.catagories.neurotransmitters.glutamate.nmda.positive_allosteric_modulator.NMDA_PositiveAllostericModulator) {
            return true;
        }
        return false;
    }
    public default boolean nmdaNegativeAllostericModulator(Product p) {
        if (p instanceof com.mycompany.myapp.catagories.neurotransmitters.glutamate.nmda.negative_allosteric_modulator.NMDA_NegativeAllostericModulator) {
            return true;
        }
        return false;
    }
    
    public default boolean ampaPositiveAllostericModulator(Product p) {
        if (p instanceof com.mycompany.myapp.catagories.neurotransmitters.glutamate.ampa.positive_allosteric_modulator.AMPA_PositiveAllostericModulator) {
            return true;
        }
        return false;
    }
    public default boolean ampaNegativeAllostericModulator(Product p) {
        if (p instanceof com.mycompany.myapp.catagories.neurotransmitters.glutamate.ampa.negative_allosteric_modulator.AMPA_NegativeAllostericModulator) {
            return true;
        }
        return false;
    }
    
    
}
