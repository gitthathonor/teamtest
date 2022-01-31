package test;

import java.util.Date;

public class DatePlanDTO {
	
	private Date start_date;
	private Date end_date;
	
	public Date getStart_date() {
		return start_date;
	}
	
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	public Date getEnd_date() {
		return end_date;
	}
	
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
	@Override
	public String toString() {
		return "DatePlanDTO [start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	
	
	
}
