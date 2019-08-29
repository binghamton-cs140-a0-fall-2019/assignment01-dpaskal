package assignment01;
import assignment01.Person;
import assignment01.DateAndPlaceOfBirth;
import assignment01.StreetUSAddress;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Create one person and see that it prints correctly add similar code
 * to print your test to the output file.
 */

public class PersonTester{
    public static void main(String[] args){
        try(var output =new PrintWriter(new FileOutputStream(
			new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR PersonTester.java:");
	        var myPDOB2 = new DateAndPlaceOfBirth(1981, 12, 12, "Varna", "Bulgaria");
	        var myAddress2 = new StreetUSAddress("22 Adams St", "", "Binghamton", "NY", "11518");
	        var myPerson2 = new Person("John", "Doe", "123-45-6789", myPDOB2, myAddress2);
	        output.println(myPerson2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        var myPDOB = new DateAndPlaceOfBirth(1981, 12, 12, "Varna", "Bulgaria");
        var myAddress = new StreetUSAddress("22 Adams St", "", "Binghamton", "NY", "11518");
        var myPerson = new Person("John", "Doe", "123-45-6789", myPDOB, myAddress);
        System.out.println(myPerson);
    }
}