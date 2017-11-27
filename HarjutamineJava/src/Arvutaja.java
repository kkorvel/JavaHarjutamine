import java.util.Scanner;

/**
 * Created by Koit on 2.06.2016.
 */
public class Arvutaja {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner uus = new Scanner(System.in);
        System.out.println("Mis on a väärtus?");
        a = uus.nextInt();
        System.out.println("Mis on b väärtus?");
        b = uus.nextInt();

        int korrutis = a * b;
        System.out.println("A ja B korrutiseks on " + korrutis);

    }
}
