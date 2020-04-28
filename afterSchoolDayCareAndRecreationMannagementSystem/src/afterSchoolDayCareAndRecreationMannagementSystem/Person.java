package afterSchoolDayCareAndRecreationMannagementSystem;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int id;
	private String street;
	private String cityOfResidence;	
	
	public Person(String firstName, String lastName, int id, String cityOfResidence) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.cityOfResidence = cityOfResidence;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCityOfResidence() {
		return this.cityOfResidence;
	}
	public void setCityOfResidence(String cityOfResidence) {
		this.cityOfResidence = cityOfResidence;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getId() {
		return this.id;
	}
	
	
	
}
