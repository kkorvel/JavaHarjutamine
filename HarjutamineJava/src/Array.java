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
        System.out.println(vastus);
        //Stringide compare on equals abil
        //https://stackoverflow.com/questions/10924561/java-scanner-string-input-if-statement-not-working
        //Why, you ask?
        //== checks to see if the actual object references are the same.
        //equals(...) checks if the two Strings hold the same string (ie the same characters in the same order)
        //debug näitab kenasti

        if (vastus.equals("Mett")){
            System.out.println("Mesi on hea!(equals) ");
        }
        else {
            System.out.println("ei ole hea");
        }
        if (vastus == "Mett"){
            System.out.println("Mesi on hea!( == )");
        }
        System.out.println("Tere! Sa ostid just " + vastus);
    }



}


