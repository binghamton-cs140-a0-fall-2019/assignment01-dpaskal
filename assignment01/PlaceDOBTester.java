package assignment01;
import assignment01.DateAndPlaceOfBirth;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


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
        try(var output =new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR PlaceDOBTester.java:");

        //Copy all your lines above, add an extra "2" to every variable name
        // and replace every System.out.print or System.out.println
        // by output.print or output.println
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DateAndPlaceOfBirth[] groupPDOB = { new DateAndPlaceOfBirth(1990, 11, 11, "Binghamton", "New York", "United States"),
                                            new DateAndPlaceOfBirth(1990, 11, 11, "Las Vegas", "Nevada", "United States"),
                                            new DateAndPlaceOfBirth(1991, 11, 11, "Dallas", "Texas", "United States"),
                                            new DateAndPlaceOfBirth(1992, 4, 8, "Prague", "Czech Republic"),
                                            new DateAndPlaceOfBirth(1993, 8, 16, "Sofia", "Bulgaria")
                                            };
        System.out.println("The five Date and Place of Birth objects are as follows:");
        for (DateAndPlaceOfBirth i : groupPDOB) {
            System.out.println(i);
        }
        for (int i = 0; i < groupPDOB.length; ++i){
            //System.out.println(groupPDOB[i]);
            for (int j = i; j < groupPDOB.length - 1; ++j){
                System.out.printf("\n");
                System.out.printf("Comparison between %s ||and|| %s\n", groupPDOB[i], groupPDOB[j+1]);
                System.out.printf("First value is older than second value: %b\n", 
                                    groupPDOB[i].olderThan(groupPDOB[j+1]));
                System.out.printf("First value is younger than second value: %b\n",
                                    groupPDOB[i].youngerThan(groupPDOB[j+1]));
                System.out.printf("First value has same birth date as second value: %b\n", 
                                    groupPDOB[i].hasSameBirthDateAs(groupPDOB[j+1]));
                System.out.printf("First value has same birthday as second value: %b\n", 
                                    groupPDOB[i].hasSameBirthDateAs(groupPDOB[j+1]));
            }
        }
    }
}