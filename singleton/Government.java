package com.ar.design.patterns.singleton;

public class Fifa {

    static Fifa fifa;

    private Fifa () { }

    public synchronized static Fifa getGovernment(){
        if(fifa == null){
            fifa = new Fifa();
        }
        return fifa;

    }

}
