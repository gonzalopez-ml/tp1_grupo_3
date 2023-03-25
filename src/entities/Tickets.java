package entities;

import java.util.Date;

public abstract class Tickets {
	private int id;
	static int count=0;
	private String showName;
	private String showSchedule;
	private Integer aproxDuration;
	private Double showCost;
	private String showType;
	
	//Constructors
	public Tickets(String showName, String showSchedule, Integer aproxDuration, String showType) {
		count++;
		this.id = count;
		this.showName = showName;
		this.showSchedule = showSchedule;
		this.aproxDuration = aproxDuration;
		this.showType = showType;
	}
	
	public Tickets() {
		count++;
		this.id = count;
	}
	
	//Getters and Setter

	public int getId() {
		return id;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getShowSchedule() {
		return showSchedule;
	}
	public void setShowSchedule(String showSchedule) {
		this.showSchedule = showSchedule;
	}
	public Integer getAproxDuration() {
		return aproxDuration;
	}
	public void setAproxDuration(Integer aproxDuration) {
		this.aproxDuration = aproxDuration;
	}
	
	public abstract Double getShowCost(); 

	public String getShowType() {
		return showType;
	}

	public void setShowType(String showType) {
		this.showType = showType;
	}
	

}
