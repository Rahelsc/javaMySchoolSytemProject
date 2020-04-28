package afterSchoolDayCareAndRecreationMannagementSystem;

import java.util.ArrayList;
import java.util.Date;

public class Employee extends Person{

	private Date firstDayOnTheJob;
	private ArrayList<DayOfEmployment> timeStamps;
	
	public Employee(String firstName, String lastName, int id, String cityOfResidence) {
		super(firstName, lastName, id, cityOfResidence);
		timeStamps = new ArrayList<DayOfEmployment>();
	}

	public Date getFirstDayOnTheJob() {
		return firstDayOnTheJob;
	}

	public void setFirstDayOnTheJob(Date firstDayOnTheJob) {
		this.firstDayOnTheJob = firstDayOnTheJob;
	}
	
	public void setTimeStart(DayOfEmployment thisDay) {
		this.timeStamps.add(thisDay);
	}
	
	public int indexOfDate(String dayTocheck) {
		for (int i = 0; i<this.timeStamps.size(); i++) {
			if (timeStamps.get(i).getDate().equals(dayTocheck)) //get date return string. but of what format? 
				return i;
		}
		return (int)this.timeStamps.get(timeStamps.size()).getTimeEnd(); // what to do if not found? this return an error
	}
	
	public float getDailyHours(String dateToCHeck) {
		return this.timeStamps.get(indexOfDate(dateToCHeck)).calculateHowManyhours();
	}
	
	public float getSumOfAllHours() {
		float sum = 0;
		for(DayOfEmployment dayOfEmp: this.timeStamps) {
			sum += dayOfEmp.calculateHowManyhours();
		}
		return sum;
	}
	
	public void addDayOfEmployment(DayOfEmployment d) {
		this.timeStamps.add(d);
	}

	public ArrayList<DayOfEmployment> getTimeStamps() {
		return this.timeStamps;
	}

	@Override
	public String toString() {
		return "Employee [firstDayOnTheJob=" + firstDayOnTheJob + ", "
				+ "timeStamps=" + timeStamps + "]";
		
	}
	
	
	
	

}
