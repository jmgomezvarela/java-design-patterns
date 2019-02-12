package com.ar.products;

public abstract class Stadium {

    private String location;
    private String name;
    private double ticketPrize;
    private double capacity;

    public Stadium(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketPrize() {
        return String.format( "$%.2f", ticketPrize);
    }

    public void setTicketPrize(double ticketPrize) {
        this.ticketPrize = ticketPrize;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	 public String getInformation(){
	        return "Stadium: " + getName() + ", Location: " + getLocation() + ", Ticket Prize: " + getTicketPrize() + " Capacity: " + getCapacity();
	 }
}