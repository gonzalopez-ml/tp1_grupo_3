package entities;

public class TicketRecital extends Tickets implements ITickets{
	
	private Band band;
	private Gender gend;
	private Integer quantitySupportBand;
	
	final Double GENERAL_SHOW_VALUE = 800.00;
	final Double VIP_SHOW_VALUE = 1500.00;
	
	
	public TicketRecital(String showName, String showSchedule, Integer aproxDuration, String showType, Band band, Gender gend, Integer quantitySupportBand) {
		super(showName, showSchedule, aproxDuration, showType);
		this.band = band;
		this.gend = gend;
		if(quantitySupportBand > 2) {
			throw new Error("El maximo son 2 bandas");
		}else {
			this.quantitySupportBand = quantitySupportBand;	
		}
	}
	
	//Getters and Setters
	public Integer getQuantitySupportBand() {
		return quantitySupportBand;
	}

	public void setQuantitySupportBand(Integer quantitySupportBand) {
		this.quantitySupportBand = quantitySupportBand;
	}

	public Gender getGend() {
		return gend;
	}

	public void setGend(Gender gend) {
		this.gend = gend;
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}
	
	@Override
	public Double getShowCost() {
		if(this.getShowType().equals("RECITAL_GENERAL")) {
			return GENERAL_SHOW_VALUE;	
		}
		return VIP_SHOW_VALUE;
	}
	
	@Override
	public String toString() {
		return "\n - Id: " + getId() +
				"\n - Show: " + getShowName() +
				"\n - Precio: " + getShowCost() +
				"\n - Dia: " + getShowSchedule() +
				"\n - Duracion: " + getAproxDuration() +
				"\n - Banda: " + getBand().getName() +
				"\n - Genero: " + getGend().getGenderType() +
				"\n - Bandas soporte: " + getQuantitySupportBand();
	}
}
