package com.ar.design.pattern.builder.team;

public class Team {

    private String name;
    private CityENUM city;
    private ColorENUM color;
    private StadiumENUM stadium;

    public Team(){

    }
    
    public CityENUM getCity() {
		return city;
	}

	public void setCity(CityENUM city) {
		this.city = city;
	}

	public ColorENUM getColor() {
		return color;
	}

	public void setColor(ColorENUM color) {
		this.color = color;
	}

	public StadiumENUM getStadium() {
		return stadium;
	}

	public void setStadium(StadiumENUM stadium) {
		this.stadium = stadium;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("In the city of ");
        sb.append(city);
        sb.append(" ,there is a team named ");
        sb.append(name);

        if (color != null) {
            sb.append(" ,their colour is ");
            sb.append(color);
        }
        if (stadium != null) {
            sb.append(" and they played at the stadium ");
            sb.append(stadium);
        }

        sb.append(".");
        return sb.toString();
    }
}