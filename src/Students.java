package hw4;

public class Students{
	String firstname;
	String lastname;
	
	/*
	 * Constructor for the book
	 */
	public Students(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
	}
	
	public String toString() {
		return firstname + " " + lastname;
	}
}
