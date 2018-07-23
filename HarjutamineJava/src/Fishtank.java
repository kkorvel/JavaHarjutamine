import java.util.Scanner;

/**
 * Created by Koit on 30.07.2016.
 */
public class Fishtank {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Kui kõrge on?");
        int height = klaviatuur.nextInt();
        System.out.println("Kui pikk on?");
        int length = klaviatuur.nextInt();
        System.out.println("Kui lai on?");
        int width = klaviatuur.nextInt();

        int ruumala = height*length*width;
        int pindala = 2*(length*width);
        System.out.println("Kalapaagi kõrgus on " + height);
        System.out.println("Kalapaagi pikkus on " + length);
        System.out.println("Kalapaagi laius on " + width);
        System.out.println("Ruumala on " + ruumala);
        System.out.println("Pindala on " + pindala);
    }
}
