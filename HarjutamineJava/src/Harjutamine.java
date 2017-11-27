import java.util.Scanner;

public class Harjutamine {
    public static void main(String[] args) {
//        Scanner klaviatuur = new Scanner(System.in);
//        String vastus = klaviatuur.next();
//        System.out.println("Arvuks on " + vastus);





        arvuti();

    }
    public static void arvuti(){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("A väärtus ");
        a = sc.nextInt();
//        System.out.println(a);
        System.out.println("B väärtus ");
        b = sc.nextInt();
//        System.out.println(b);
        int summa = a + b;
        System.out.println("Summa on " + summa);

    }
}

