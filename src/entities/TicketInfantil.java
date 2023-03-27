package entities;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TicketInfantil extends Tickets{
    
	//Encapsulamiento
	private int minAge;
    private String souvenir;
    
    final static int AGE_MIN_DEFAULT = 8;
    final static double COST_INFANTIL_MINOR = 250;
    final static double COST_INFANTIL_HIGHER = 500;

    public TicketInfantil(String showName, String showSchedule, Integer aproxDuration, String showType, Integer minAge, String souvenir) 
    	  {
    		
    		super(showName, showSchedule, aproxDuration, showType);
    		
        this.minAge = minAge;
        this.souvenir = souvenir;
    }

    public int getminAge() {
       
    	//Validación Edad  
    	if (minAge < 0)  {
              throw new IllegalArgumentException("La edad mínima no puede ser negativa.");
          } else 
        	  return this.minAge;
    	  }


    public void setminAge(int minAge) {
        if (minAge < 0) {
            throw new IllegalArgumentException("La edad mínima no puede ser negativa.");
        } 
    }

 
    public String getSouvenir() {
		
    	 Pattern pat = Pattern.compile("(SI|NO)+");
         Matcher mat = pat.matcher(souvenir);   	
    	
         if (mat.matches()) {
             return this.souvenir;
         } else {
        	 throw new IllegalArgumentException("ERROR! Ingreso: "+this.souvenir +". Debe Ingresar SI o NO");                                                                               
         }
	
    }

	public void setSouvenir(String souvenir) {
		this.souvenir = souvenir;
	}

	@Override
    public Double getShowCost() {
        if (this.minAge < AGE_MIN_DEFAULT) {
            return COST_INFANTIL_MINOR;
        } else {
        	return COST_INFANTIL_HIGHER;
        }
    }

	@Override
    public void Information() {
    	System.out.println("********* INFANTILES *************** \n Id: " + getId() +
				"\n - Show: " + getShowName() +
				"\n - Precio: " + this.getShowCost() +
				"\n - Dia: " + getShowSchedule() +
				"\n - Duracion: " + getAproxDuration() +
				"\n - Genero: " + getShowType() +
				"\n - EDAD: " + getminAge()+
				"\n - SOUVENIR: " + getSouvenir());
	}

    
}