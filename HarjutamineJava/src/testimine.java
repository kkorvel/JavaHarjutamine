import java.util.Scanner;

/**
 * Created by Koit on 26.07.2016.
 */
public class testimine {
    public static void main(String[] args) {

        System.out.println("Mis aasta praegu on?");
        Scanner klaviatuur = new Scanner(System.in);
        int praeguneaasta = klaviatuur.nextInt();
        int järgmineaasta = praeguneaasta+1;
        System.out.println("Praegune aasta on " + praeguneaasta);
        System.out.println("Järgmine aasta on "+ järgmineaasta);
    }
}
