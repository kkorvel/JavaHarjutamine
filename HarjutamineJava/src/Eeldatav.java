import java.util.Scanner;

public class Eeldatav {
    public static void main(String[] args) {
        int piirkiirus = 50;
        int vastus;
        System.out.println("Mis on kiirus?");
        Scanner scanner = new Scanner(System.in);
        int sõidetud = scanner.nextInt();
        if(sõidetud == piirkiirus){
            System.out.println("Õige kiirus!");
        }else if(sõidetud > piirkiirus){
            vastus = sõidetud - piirkiirus;
            System.out.println("Sõitsid " + vastus + "üle!");
        }else if(sõidetud < piirkiirus){
            vastus = piirkiirus - sõidetud;
            System.out.println("Sõitsid " + vastus + "vähem!");
        }

    }
}
