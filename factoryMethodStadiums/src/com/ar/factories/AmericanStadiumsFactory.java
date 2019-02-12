package com.ar.factories;

import com.ar.products.AntonioVespucioLiberti;
import com.ar.products.Stadium;

public class AmericanStadiumsFactory extends StadiumsFactory {
    @Override
    public Stadium createStadium(String stadiumtName) {
    	Stadium stadium = null;

        if(stadiumtName.equalsIgnoreCase("Antonio Vespucio Liberti")){
        	stadium = new AntonioVespucioLiberti();      
        }

        return stadium;
    }
}