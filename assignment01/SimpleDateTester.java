package assignment01;
import assignment01.SimpleDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
	public static void main(String[] args) {
        try(var output =new PrintWriter(new FileOutputStream(
            new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR SimpleDateTester.java:");
    		SimpleDate dateOne2 = SimpleDate.of(1980, 12, 12);
    		SimpleDate dateTwo2 = SimpleDate.of(1979, 12, 12);
    		output.printf("Is date one before date two?%b\n", dateOne2.before(dateTwo2));
    		output.printf("Is date two before date one?%b\n", dateTwo2.before(dateOne2));

        //Copy all your lines above, add an extra "2" to every variable name
        // and replace every System.out.print or System.out.println
        // by output.print or output.println
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		SimpleDate dateOne = SimpleDate.of(1980, 12, 12);
		SimpleDate dateTwo = SimpleDate.of(1979, 12, 12);
		System.out.printf("Is date one before date two?%b\n", dateOne.before(dateTwo));
		System.out.printf("Is date two before date one?%b\n", dateTwo.before(dateOne));
	}
}