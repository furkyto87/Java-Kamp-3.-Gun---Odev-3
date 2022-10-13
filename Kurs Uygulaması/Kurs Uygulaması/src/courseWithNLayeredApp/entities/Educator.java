package courseWithNLayeredApp.entities;

public class Educator {
	private int educatorId;
	private String firstName;
	private String lastName;

	public Educator() {

	}

	public Educator(int educatorId, String firstName, String lastName) {
		this.educatorId = educatorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int geteducatorId() {
		return educatorId;
	}

	public void seteducatorId(int educatorId) {
		this.educatorId = educatorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
