package com.ar.factories;

import com.ar.products.DelleAlpi;
import com.ar.products.OldTrafford;
import com.ar.products.ParcDesPrinces;
import com.ar.products.SantiagoBernabeu;
import com.ar.products.Stadium;

public class EuropeanStadiumsFactory extends StadiumsFactory {
    @Override
    public Stadium createStadium(String stadiumName) {
    	Stadium stadium = null;

        if(stadiumName.equalsIgnoreCase("Santiago Bernabeu")){
            stadium = new SantiagoBernabeu();
        }else if(stadiumName.equalsIgnoreCase("Old Trafford")){
        	stadium = new OldTrafford();
        }else if(stadiumName.equalsIgnoreCase("ParcDesPrinces")){
        	stadium = new ParcDesPrinces();
        }else if(stadiumName.equalsIgnoreCase("Old Trafford")){
        	stadium = new OldTrafford();       
        }else if(stadiumName.equalsIgnoreCase("Delle Alpi")){
        	stadium = new DelleAlpi();
        }        
        return stadium;
    }
}