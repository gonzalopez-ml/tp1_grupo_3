package entities;

import java.util.Date;

public class TicketTeatro extends Tickets{
	
	private TheatreGenderType GenderType;
	private Integer actors;
	
	final Double THEATRE_VALUE = 1350.50;
	
	
	//Constructor
	public TicketTeatro(String showName, String showSchedule, Integer aproxDuration, String showType,TheatreGenderType GenderType, Integer actors) {
		super(showName, showSchedule, aproxDuration, showType);
		this.GenderType = GenderType;
		if(actors > 3) {
			throw new Error("El maximo de actores es 3");
		}else {
			this.actors = actors;	
		}		
	}
	
	public TicketTeatro() {
		super();
	}
	
	//Getters and setters
	
	public TheatreGenderType getGenderType() {
		return GenderType;
	}

	public void setGenderType(TheatreGenderType genderType) {
		GenderType = genderType;
	}

	public Integer getActors() {
		return actors;
	}

	public void setActors(Integer actors) {
		this.actors = actors;
	}
	
	//Methods
	
	@Override
	public Double getShowCost() {		
		return THEATRE_VALUE;
	}
	
	public void Information() {
		System.out.println("********* ESPECTACULOS *************** \n Id: " + getId() +
				"\n - Show: " + getShowName() +
				"\n - Precio: " + getShowCost() +
				"\n - Dia: " + getShowSchedule() +
				"\n - Duracion: " + getAproxDuration() +
				"\n - Genero: " + getGenderType() +
				"\n - Actores: " + getActors());
	}

}
