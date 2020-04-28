package afterSchoolDayCareAndRecreationMannagementSystem;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DayOfEmployment day;
		ClassInstructor c = new ClassInstructor("rahel", "schwartz", 200563823, "petach-tikva");
		for (int i = 0; i<4; i++) {
			System.out.println("please enter start hour");
			day = new DayOfEmployment(input.nextFloat());
			System.out.println("please enter end hour");
			day.setTimeEnd(input.nextFloat());
			c.addDayOfEmployment(day);			
		}
		
		System.out.println(c);
		System.out.println(c.getDailyHours("28-004-2020"));//problem!! look in employee
		System.out.println(c.getSumOfAllHours());
	}

}
