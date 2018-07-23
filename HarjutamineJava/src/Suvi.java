import java.util.Scanner;

public class Suvi {
    public static void main(String[] args) {
        Temperatuur();
        Temperatuurike(31);
    }
    public static void Temperatuur(){
        Scanner sc = new Scanner(System.in);
        Integer temperatuur = sc.nextInt();
        if (temperatuur > 30){
            System.out.println("Kuum ilm!");
        }else {
            System.out.println("Mõnus ilm");
        }
    }
    public static Integer Temperatuurike(Integer temp){
        if(temp > 30){
//            System.out.println("Soe");
        }else{
//            System.out.println("Külm");
        }
        System.out.println(temp);
        return temp;
    }
}
