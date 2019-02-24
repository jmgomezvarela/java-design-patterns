package com.ar.design.pattern.builder.team;

public class TeamBuilder {

    private Team team;

    public TeamBuilder(CityENUM cityENUM, String name) {
        this.team = new Team();
        if (cityENUM == null || name == null) {
            throw new IllegalArgumentException(
                    "City and name must be completed.");
        }
        team.setCity(cityENUM);
        team.setName(name);
    }

    public TeamBuilder  withColor(ColorENUM color) {
    	team.setColor(color);
        return this;
    }

    public TeamBuilder withStadium(StadiumENUM estadio) {
        team.setStadium(estadio);
        return this;
    }

    public Team build() {
        return team;
    }
}