import java.util.Scanner;

public class Eeldatav {
    public static void main(String[] args) {
        int korras = 50;
        int vastus;
        System.out.println("Mis on kiirus?");
        Scanner scanner = new Scanner(System.in);
        int correct = scanner.nextInt();
        if(correct == korras){
            System.out.println("Õige kiirus!");
        }else if(correct > korras){
            vastus = correct - korras;
            System.out.println("Sõitsid " + vastus + "üle!");
        }else if(correct < korras){
            vastus = korras - correct;
            System.out.println("Sõitsid " + vastus + "vähem!");
        }

    }
}
