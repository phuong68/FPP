package Lesson11_1;

public class Key{
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object obj) {
		//if (obj == null || obj.getClass()==Key.class) return false; 
		Key key = (Key)obj;
		return key.firstName == this.firstName && key.lastName == this.lastName;
	}
	
	@Override
	public int hashCode() {
		return 11+this.firstName.hashCode() + this.lastName.hashCode();
	}
}
