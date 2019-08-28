package assignment01;
import assignment01.Computer;


public class ComputerTester {
    public static void main(String[] args) {
        //DONE make 4 different Computer objects with different 
        //combinations of disk size (two more than a terabyte and two less)
        //and for each make one an SSD drive and the other not.
        //Then call System.out.println(comp); for each "comp" object
        //and observe that there are small differences in how the computer
        //information prints out.
        
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
