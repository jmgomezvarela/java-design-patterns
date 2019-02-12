package com.ar.uso;

import com.ar.factories.AmericanStadiumsFactory;
import com.ar.factories.EuropeanStadiumsFactory;
import com.ar.factories.StadiumsFactory;
import com.ar.products.Stadium;

public class StadiumsFactoryTestDrive {

    public static void main(String[] args) {

        StadiumsFactory factory;
        Stadium stadiumCreated;

        factory = new EuropeanStadiumsFactory();

        System.out.println("For Old Trafford:");
        stadiumCreated = factory.createStadium("old trafford");
        if(stadiumCreated != null){
            System.out.println(stadiumCreated.getInformation());
        }else{
            System.out.println("No stadium created.");
        }

        System.out.println("For Delle Alpi:");
        stadiumCreated = factory.createStadium("delle alpi");
        if(stadiumCreated != null){
            System.out.println(stadiumCreated.getInformation());
        }else{
            System.out.println("No stadium created.");
        }
        
        System.out.println("For Santiago Bernabeu:");
        stadiumCreated = factory.createStadium("santiago bernabeu");
        if(stadiumCreated != null){
            System.out.println(stadiumCreated.getInformation());
        }else{
            System.out.println("No stadium created.");
        }
        
        System.out.println("For Parc des Princes:");
        stadiumCreated = factory.createStadium("Parc des Princes");
        if(stadiumCreated != null){
            System.out.println(stadiumCreated.getInformation());
        }else{
            System.out.println("No stadium created.");
        }

        factory = new AmericanStadiumsFactory();
        
        System.out.println("For Antonio Vespucio Liberti:");
        stadiumCreated = factory.createStadium("antonio vespucio liberti");
        if(stadiumCreated != null){
            System.out.println(stadiumCreated.getInformation());
        }else{
            System.out.println("No stadium created.");
        }      
     
    }
}