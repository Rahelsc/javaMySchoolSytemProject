package afterSchoolDayCareAndRecreationMannagementSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfEmployment {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	private Date currentDate;
	private String date;
	private float timeStart;
	private float timeEnd;
	private float hourWorkInAday;
	
	public DayOfEmployment(float timeStart) {
		this.currentDate = new Date();
		this.date = dateFormat.format(currentDate);
		this.timeStart = timeStart;
	}

	public String getDate() {
		return this.date;
	}

	public float getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(float timeStart) {
		this.timeStart = timeStart;
	}

	public float getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(float timeEnd) {
		this.timeEnd = timeEnd;
	}
	
	public float calculateHowManyhours() {
		hourWorkInAday = this.timeEnd-this.timeStart;
		return this.hourWorkInAday;
	}

	@Override
	public String toString() {
		return "DayOfEmployment [currentDate=" + currentDate + ", timeStart=" + timeStart + ", timeEnd=" + timeEnd
				+ "]";
	}
	
	
	
	
}
