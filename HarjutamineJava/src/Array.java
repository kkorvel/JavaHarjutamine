import java.util.Scanner;

/**
 * Created by Koit on 5.07.2016.
 */
public class Array {
    public static void main(String[] args) {
        String[] ostukorv;
        ostukorv = new String[3];
        ostukorv[0] = "Apelsin";
        ostukorv[1] = "Kohvi";
        ostukorv[2] = "Mesi";
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Mida sa soovid osta! Kas Apelsini, Kohvi, Mett, Hapukoort?");
        String vastus = klaviatuur.next();
        System.out.println("Tere! Sa ostid just "+ ostukorv);
        }


    }


