public class While {

    private static int number = 0;

    public static void main(String[] args) {
        WhileLoop(30);
    }

    public static void WhileLoop(int correctNumber){
        while (number < correctNumber){
            number++;
            System.out.println(number);
        }
    }

}
