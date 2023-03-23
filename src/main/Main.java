package main;

import entities.Band;
import entities.Gender;
import entities.RecitalGenderType;
import entities.TheatreGenderType;
import entities.TicketRecital;
import entities.TicketTeatro;
import entities.Tickets;

public class Main {

	public static void main(String[] args) {
		//Prueba
		Tickets tick = new TicketTeatro("Prueba teatro","25-03-2023",100, "Teatro", TheatreGenderType.DRAMA, 3);
		System.out.println(tick.toString());
		Band band = new Band("RHCP");
		Gender gender = new Gender();
		gender.setGenderType(RecitalGenderType.ROCK);
		Tickets tick2 = new TicketRecital("Prueba recital","25-03-2023",100, "RECITAL_GENERAL", band, gender, 2);	
		System.out.println(tick2.toString());
	}

}
