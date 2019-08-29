package assignment01;
import assignment01.Computer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
    public static void main(String[] args) {
        //DONE make 4 different Computer objects with different 
        //combinations of disk size (two more than a terabyte and two less)
        //and for each make one an SSD drive and the other not.
        //Then call System.out.println(comp); for each "comp" object
        //and observe that there are small differences in how the computer
        //information prints out.
    	
    	try(var output =new PrintWriter(new FileOutputStream(
			new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerTester.java:");
	        Computer[] ComputerGroup2 = { new Computer("Apple", "Intel Core i3", 2, 500, true, 250),
                    					  new Computer("Asus", "Intel Core i5", 4, 1000, false, 500),
                    					  new Computer("Dell", "Intel Core i7", 8, 3000, true, 1000),
                    					  new Computer("Samsung", "Intel Core i9", 16, 4000, false, 2000)
                   						};
	        for (Computer i : ComputerGroup2) {
	        	output.println(i);
	        }
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        
        Computer[] ComputerGroup = { new Computer("Apple", "Intel Core i3", 2, 500, true, 250),
                                     new Computer("Asus", "Intel Core i5", 4, 1000, false, 500),
                                     new Computer("Dell", "Intel Core i7", 8, 3000, true, 1000),
                                     new Computer("Samsung", "Intel Core i9", 16, 4000, false, 2000)
                                    };
        for (Computer i : ComputerGroup) {
            System.out.println(i);
        }
    }
}
