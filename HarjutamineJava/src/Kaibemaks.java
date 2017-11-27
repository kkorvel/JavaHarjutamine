import java.util.Scanner;

/**
 * Created by Koit on 17.06.2016.
 */
public class Kaibemaks {
    public static void main(String[] args) {

     Scanner asi = new Scanner(System.in);
        System.out.println("Mis on toote hind?");
        int hind = asi.nextInt();
        System.out.println("Toote hind on "+ hind);
        double kaibemaks = hind * 1.2;
        System.out.println("Toote hind koos käibemaksuga on " + kaibemaks);


    }
}
