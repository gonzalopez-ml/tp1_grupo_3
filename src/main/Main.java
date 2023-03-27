package main;

import entities.Band;
import entities.Gender;
import entities.RecitalGenderType;
import entities.SportType;
import entities.TheatreGenderType;
import entities.TicketRecital;
import entities.TicketTeatro;
import entities.Tickets;
import entities.TitleHeader;
//Santiago
import entities.TicketInfantil;



public class Main {

	public static void main(String[] args) {
		
		 TitleHeader header = new TitleHeader();
		 System.out.println(header.toString());

		
		//Prueba
		 
		Tickets tick = new TicketTeatro("Prueba teatro","25-03-2023",100, "Teatro", TheatreGenderType.DRAMA, 3);
		tick.Information();
		Band band = new Band("RHCP");
		Gender gender = new Gender();
		gender.setGenderType(RecitalGenderType.ROCK);
		Tickets tick2 = new TicketRecital("Prueba recital","25-03-2023",100, "RECITAL_GENERAL", band, gender, 2);	
		tick2.Information();
		
		
		//SANTIAGO CIRONE
		Tickets tick3 =  new TicketInfantil("Prueba INFANTIL","25-03-2023",100, "INFANTIL",10,"NO");
		tick3.Information();
		
		//BALTAZAR GARCIA
		Tickets tick4 = new entities.TicketDeportes("Prueba DEPORTES", "27-03-2023", 90, "ARGENTINA vs CURAZAO", false, SportType.FOOTBALL);
		tick4.Information();
	}

}
