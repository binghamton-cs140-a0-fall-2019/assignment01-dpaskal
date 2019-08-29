package assignment01;
import assignment01.ComputerOwner;
import assignment01.Computer;
import assignment01.Person;
import assignment01.DateAndPlaceOfBirth;
import assignment01.StreetUSAddress;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


class ComputerOwnerTester{
    public static void main(String[] args){
        try(var output =new PrintWriter(new FileOutputStream(
        	new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR ComputerOwnerTester.java:");
            var myPDOB2 = new DateAndPlaceOfBirth(1981, 12, 12, "Varna", "Bulgaria");
            var myAddress2 = new StreetUSAddress("22 Adams St", "", "Binghamton", "NY", "11518");
            var myPerson2 = new Person("John", "Doe", "123-45-6789", myPDOB2, myAddress2);
            var myComputerOwner2 = new ComputerOwner(myPerson2);

            Computer[] CompGroup2 = {new Computer("Apple", "Intel Core i3", 2, 500, true, 250),
                                    new Computer("Asus", "Intel Core i5", 4, 1000, false, 500),
                                    new Computer("Dell", "Intel Core i7", 8, 3000, true, 1000),
                                    new Computer("Samsung", "Intel Core i9", 16, 4000, false, 2000)
                                    };

            for (int i = 0; i < CompGroup2.length; ++i){
                myComputerOwner2.addComputer(CompGroup2[i]);
            }
            output.println(myComputerOwner2);

            // Then remove 2 computers and print it again.
            for (int j = 0; j < 2; ++j){
                myComputerOwner2.removeComputer(j);
            }
            output.println(myComputerOwner2);
        //Copy all your lines above, add an extra "2" to every variable name
        // and replace every System.out.print or System.out.println
        // by output.print or output.println
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //my code here
        var myPDOB = new DateAndPlaceOfBirth(1981, 12, 12, "Varna", "Bulgaria");
        var myAddress = new StreetUSAddress("22 Adams St", "", "Binghamton", "NY", "11518");
        var myPerson = new Person("John", "Doe", "123-45-6789", myPDOB, myAddress);
        var myComputerOwner = new ComputerOwner(myPerson);

        Computer[] CompGroup = {new Computer("Apple", "Intel Core i3", 2, 500, true, 250),
                                new Computer("Asus", "Intel Core i5", 4, 1000, false, 500),
                                new Computer("Dell", "Intel Core i7", 8, 3000, true, 1000),
                                new Computer("Samsung", "Intel Core i9", 16, 4000, false, 2000)
                                };

        for (int i = 0; i < CompGroup.length; ++i){
            myComputerOwner.addComputer(CompGroup[i]);
        }
        System.out.println(myComputerOwner);

        // Then remove 2 computers and print it again.
        for (int j = 0; j < 2; ++j){
            myComputerOwner.removeComputer(j);
        }
        System.out.println(myComputerOwner);
    }
}