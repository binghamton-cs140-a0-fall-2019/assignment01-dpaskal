package assignment01;
import assignment01.StreetUSAddress;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * Tester for StreetUSAddress class
 * @author Daniel Paskalev
 */
public class USAddressTester{
    public static void main(String[] args){
        try(var output =new PrintWriter(new FileOutputStream(
            new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR USAddressTester.java:");
            var addressOne2 = new StreetUSAddress(
                    "123 Main St", "Apt 101", "Binghamton", "NY", "11518");
            var addressTwo2 = new StreetUSAddress(
                    "45 Adams St", "", "Binghamton", "NY", "11518");
            output.printf("The first address is: \n%s\n", addressOne2);
            output.printf("The second adresss is: \n%s\n", addressTwo2);
            
        //Copy all your lines above, add an extra "2" to every variable name
        // and replace every System.out.print or System.out.println
        // by output.print or output.println
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        var addressOne = new StreetUSAddress(
            "123 Main St", "Apt 101", "Binghamton", "NY", "11518");
        var addressTwo = new StreetUSAddress(
            "45 Adams St", "", "Binghamton", "NY", "11518");
        System.out.printf("The first address is: \n%s\n", addressOne);
        System.out.printf("The second adresss is: \n%s\n", addressTwo);
    }
}