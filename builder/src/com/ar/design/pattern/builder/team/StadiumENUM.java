package com.ar.design.pattern.builder.team;

public enum StadiumENUM {

    MADRID("Santiago Bernabeu"), CORUNA("Riazor"), BARCELONA("Camp Nou"), SEVILLA("Sanchez Pizjuan");
	
    private String stadiumName;

    StadiumENUM(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    @Override
    public String toString() {
        return stadiumName;
    }
}