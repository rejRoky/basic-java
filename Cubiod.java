import java.lang.*;
import java.util.Scanner;

/**
 * Cubiod
 */
public class Cubiod {

    public static void main(String[] args) {

        int lenght, breath, height, totalArea, volume;

        Scanner s = new Scanner(System.in);
        System.out.println(
            "Enter Length of Cubiod :"
        );
        lenght = s.nextInt();

        System.out.println(
            "Enter Breath of Cubiod :"
        );
        breath= s.nextInt();
        
        System.out.println(
            "Enter Height of Cubiod :"
        );
        height = s.nextInt();

        // Cubiod Voleume
        volume = lenght * breath * height;
        System.out.println("Cubiod Volume: "+volume);


        // Cubiod Total Area
        totalArea = 2*((lenght*height) + (breath*height) + (lenght*breath));
        System.out.println("Cubiod Total Area: "+totalArea);
        
    }

}