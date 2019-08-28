package assignment01;
import assignment01.Person;
import assignment01.DateAndPlaceOfBirth;
import assignment01.StreetUSAddress;

/**
 * Create one person and see that it prints correctly add similar code
 * to print your test to the output file.
 */

public class PersonTester{
    public static void main(String[] args){
        var myPDOB = new DateAndPlaceOfBirth(1981, 12, 12, "Varna", "Bulgaria");
        var myAddress = new StreetUSAddress("22 Adams St", "", "Binghamton", "NY", "11518");
        var myPerson = new Person("John", "Doe", "123-45-6789", myPDOB, myAddress);
        System.out.println(myPerson);
    }
}