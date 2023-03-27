package entities;


public class TicketDeportes extends Tickets{
	
	final static double COST_FOOTBALL = 300;
	final static double COST_RUGBY = 450;
	final static double COST_HOCKEY = 380;
	private boolean IsInternational;
	private SportType SportType;
	
	public TicketDeportes(String showName, String showSchedule, Integer aproxDuration, String showType, boolean IsInternational, SportType SportType) {
		super(showName, showSchedule, aproxDuration, showType);
		this.IsInternational = IsInternational;
		this.SportType = SportType;
	}
	
    @Override// Method
    public Double getShowCost() {
    	
    	double international = 1;
    	
		if(this.IsInternational == true){
			international += 0.30;
        }
    
    	if(this.SportType == entities.SportType.FOOTBALL ) {
    		return COST_FOOTBALL * international;
    	} else if(this.SportType == entities.SportType.HOCKEY) {
    		return COST_HOCKEY * international;
    	} else {
    		return COST_RUGBY * international;
    	}
    }
    
    public SportType getSportType() {
		
   	 return SportType;
	
   }
    
    public String getInternational() {
		if(IsInternational == true)
			return "Si";
		return "No";
   	
      }

	public void setSportType(SportType SportType) {
		this.SportType = SportType;
	}
    
		
	@Override
    public void Information() {
		 System.out.println("********* DEPORTES *************** \n Id: " + getId() +
				"\n - Show: " + getShowName() +
				"\n - Precio: " + this.getShowCost() +
				"\n - Dia: " + getShowSchedule() +
				"\n - Duracion: " + getAproxDuration() +
				"\n - Asunto: " + getShowType() +
				"\n - Es internacional: " + getInternational() +
				"\n - Deporte: " + getSportType());
	}
}
