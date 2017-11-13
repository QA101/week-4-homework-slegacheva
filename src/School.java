package hw4;

import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.Map;
import java.util.Scanner;

import javax.rmi.CORBA.Stub;

public class School {
	
	//Variables for this class
	ArrayList<Book> catalog = new ArrayList<Book>();
	ArrayList<Students> catalog1 = new ArrayList<Students>();
//	ArrayList<Student> catalog1 = new ArrayList<Student>();
	//int numStudents = 0;
    String name;
    //String name1;
   
	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	public static void main(String args[]) {
		//TODO create a school (similar to the library)
		School school = new School("Issaquah Valey Elementary");	
		school.Students();
		System.out.println(school.toString());
		
		
		//System.out.println("Students:");
		//System.out.println(students.toString1());

		//TODO Print the toString method in school. Such as, school.toString()
		
		//TODO Print any other variables that make sense for a school. Be creative.
	}
	
	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name) {
		this.name = name;
        catalog.add(new Book("Dune", 500, "Fiction", "Frank Herbert"));
		
		catalog.add(new Book("The Wretched of Muirwood (Legends of Muirwood Book 1)", 300, "Fantasy", "Jeff Wheeler"));
		
		catalog.add(new Book("The Blight of Muirwood (Legends of Muirwood Book 2)", 466, "Fantasy", "Jeff Wheeler"));
		
		catalog.add(new Book("Dune Messiah", 340, "Science Fiction", ""));
		
		catalog.add(new Book("Children of Dune", 420, "Science Fiction",  ""));
		catalog.size();
	}
	
	/**
	 * Write a method to return a list of all books at the school
	 */
	public String toString() {
		//TODO Write a method to return a list of all books at the school
		//return "TODO";
		String returnString = "Books: " + "\n" ;
		for( Book b : catalog) {
			returnString += b + "\n";
		}
		returnString += "\nTotal books: " + catalog.size() + "\n";
		
		returnString += "\nStudents: " + "\n" ;
		for( Students s : catalog1) {
			returnString += s + "\n";
		}
		returnString += "\nTotal students: " + catalog1.size();
		
		return returnString;
	}
	
	/**
	 * adds a single student to the school
	 */

	public void Students() {
        catalog1.add(new Students("Svetlana","Legacheva"));
        
        catalog1.add(new Students("Tony","Lawrence"));
		
		catalog1.add(new Students("Dmitry","Livinov"));
	}
	
	}

