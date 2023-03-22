package entities;

public class TicketRecital extends Tickets {
	
	private Band band;
	private Gender gend;
	private Integer quantitySupportBand;
	
	final Double SHOW_VALUE = 1500.00;
	
	

	@Override
	public Double getShowCost() {
		return SHOW_VALUE;
	}

	public TicketRecital() {
		
	}
}
