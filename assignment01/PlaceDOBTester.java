package assignment01;
import assignment01.DateAndPlaceOfBirth;


public class PlaceDOBTester{
    public static void main(String[] args){
        // Write a class PlaceDOBTester.java with a main method to check 
        // out the DateAndPlaceOfBirth class:
        // In the main method make 5 DateAndPlaceOfBirth objects 3 with birth 
        // places in the USA (with a State) and 2 from other countries using the 
        // 2nd constructor that does not have a state parameter. Give two objects 
        // the same birth date and have another object with the same birthday 
        // (day and month) but a different birth year.
        // Use System.out.println to print each of the 5 objects and then to 
        // print the values of the four other methods that are not getter methods, 
        // e.g., System.out.println(object1.hasSameBirthDayAs(object2)).
        // You will need many lines to test the 4 methods, we want to see that 
        // get the right true and false values for the different combinations of 
        // the objects you made.

        DateAndPlaceOfBirth[] groupPDOB = { new DateAndPlaceOfBirth(1990, 11, 11, "Binghamton", "New York", "United States"),
                                            new DateAndPlaceOfBirth(1990, 11, 11, "Las Vegas", "Nevada", "United States"),
                                            new DateAndPlaceOfBirth(1991, 11, 11, "Dallas", "Texas", "United States"),
                                            new DateAndPlaceOfBirth(1992, 4, 8, "Prague", "Czech Republic"),
                                            new DateAndPlaceOfBirth(1993, 8, 16, "Sofia", "Bulgaria")
                                            };
        for (DateAndPlaceOfBirth i : groupPDOB) {
            System.out.println(i);
        }
        for (int i = 0; i < groupPDOB.length; ++i){
            System.out.println(groupPDOB[i]);
        }
    }
}