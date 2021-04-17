package person;

public class Person {
	String firstName;
	String middleName;
	String lastName;
	
	public Person() {}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/*
	 * Получение полного имени
	 */
	public String getFullName() {
		if ((firstName == null) && (middleName == null)) {
			return lastName;
		} else if (firstName == null) {
			return lastName + " " + middleName;
		} else if (middleName == null) {
			return lastName + " " + firstName;
		} else {
			return lastName + " " + middleName + " " + firstName;
		}
	}
	public String getReducedName() {
		if ((firstName == null) && (middleName == null)) {
			return lastName;
		} else if (firstName == null) {
			return lastName + " " + middleName.charAt(0) + ".";
		} else if (middleName == null) {
			return lastName + " " + firstName.charAt(0) + ".";
		} else {
			return lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".";
		}
	}
}
