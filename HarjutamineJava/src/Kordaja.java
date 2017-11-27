import java.util.Scanner;

public class Kordaja {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Prindi mitu korda?");
        int kordaja = klaviatuur.nextInt();
        for (int i = 0; i < kordaja ; i++) {
            System.out.println("Tere!!!");

        }
    }
}
