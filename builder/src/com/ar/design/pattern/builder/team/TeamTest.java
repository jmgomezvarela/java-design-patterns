package com.ar.design.pattern.builder.team;

public class TeamTest {

    public static void main(String[] args) {
        Team madrid = new TeamBuilder(CityENUM.MADRID, "Real de Madrid").withColor(ColorENUM.WHITE).withStadium(StadiumENUM.MADRID).build();
        System.out.println(madrid);

        Team sevilla = new TeamBuilder(CityENUM.SEVILLA, "Real Sevilla").withColor(ColorENUM.VIOLET).withStadium(StadiumENUM.SEVILLA).build();
        System.out.println(sevilla);
        
        Team depor = new TeamBuilder(CityENUM.CORUNA, "Real Deportivo la Coruna").withColor(ColorENUM.BLUE).withStadium(StadiumENUM.CORUNA).build();
        System.out.println(depor);
        
        Team barca = new TeamBuilder(CityENUM.BARCELONA, "FC Barcelona").withColor(ColorENUM.RED).withStadium(StadiumENUM.BARCELONA).build();
        System.out.println(barca);
    }
}