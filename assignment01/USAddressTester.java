package assignment01;
import assignment01.StreetUSAddress;
/**
 * Tester for StreetUSAddress class
 * @author Daniel Paskalev
 */
public class USAddressTester{
    public static void main(String[] args){
        var addressOne = new StreetUSAddress(
            "123 Main St", "Apt 101", "Binghamton", "NY", "11518");
        var addressTwo = new StreetUSAddress(
            "45 Adams St", "", "Binghamton", "NY", "11518");
        System.out.printf("The first address is: \n%s\n", addressOne);
        System.out.printf("The second adresss is: \n%s\n", addressTwo);
    }
}