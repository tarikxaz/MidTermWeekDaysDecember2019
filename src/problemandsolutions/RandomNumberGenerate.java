package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {
        Random ran=new Random(); //instance of random class
        int highestnumber = 8;
        int randomnumber = ran.nextInt(highestnumber);
        System.out.println("random Integer value from 1 to 8: "+(randomnumber+1));

    }

}
