import Scanner;
import java.lang.*;  

/**
 * https://onecompiler.com/java/3x4zft6rc
 * Challenge 2:  
 * Create a Java class to print your name, nationality and biggest dream.
 * Requirements:
 * - You need to display the results on screen;
 * - You need to use Java;
 * - You don’t need to persist any data (but feel free to do it if you want);
 */

public class Challenge2 {

/** Java Class Employee
*/
static public class Employee{
 	private String name; 
	private String nationality;
	private String dream;

	public Employee(String nm, String nat, String dr) { 
		name=nm;
		nationality=nat;
		dream=dr;
  	}

	/* Method to Print name, nationality, dream */
  	public void PrintName() {
      	    System.out.println("\nName: "+name);
 	    System.out.println("\nNationality: "+nationality);
	    System.out.println("\nBiggest dream: "+dream);
  	}
}

public static void main(String[] args) {
	System.out.println("Challenge2:");
	System.out.println("Printing Name, Nationality and Biggest dream");
	System.out.println();
	/** input manually name, nationality and dream
            Scanner input = new Scanner(System.in);
 	    String name = input.next();
            String ct = input.next();
	    String dream = input.next();
	    Employee newEp = new Employee(name,ct,dream);
	    System.out.println();
	    newEp.PrintName();
	*/
	/** Fixed name to print */
	Employee emp = new Employee("Alex","Brazil","Visit Japan");
  	emp.PrintName();
}
}