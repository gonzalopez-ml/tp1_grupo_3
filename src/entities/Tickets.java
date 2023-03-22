package entities;

import java.util.Date;

public abstract class Tickets {
	private Integer id;
	private String showName;
	private Date showSchedule;
	private Integer aproxDuration;
	private Double showCost;
	
	//Constructors
	public Tickets(Integer id, String showName, Date showSchedule, Integer aproxDuration) {
		super();
		this.id = id;
		this.showName = showName;
		this.showSchedule = showSchedule;
		this.aproxDuration = aproxDuration;
	}
	
	public Tickets() {

	}
	
	//Getters and Setter

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Date getShowSchedule() {
		return showSchedule;
	}
	public void setShowSchedule(Date showSchedule) {
		this.showSchedule = showSchedule;
	}
	public Integer getAproxDuration() {
		return aproxDuration;
	}
	public void setAproxDuration(Integer aproxDuration) {
		this.aproxDuration = aproxDuration;
	}
	public Double getShowCost() {
		return showCost;
	}
}
