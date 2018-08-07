public class ForLoops {
    public static void main(String[] args) {

        ForCount(8,89);
    }
    public static void ForCount(int number, int secondNumber){
        int sum = number * secondNumber;
        System.out.println(sum);
        for (int i = 0; i < sum + 1 ; i++) {
            System.out.println(i);

        }
    }
}
