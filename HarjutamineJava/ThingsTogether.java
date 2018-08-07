public class ThingsTogether {
    //kindla formaadiga
    @Override
    public String toString() {
        return "ThingsTogether{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //global variable
    private int age;
    private String name;
    //static ehk staatiline ehk liikumatu, seda ei nullita ära!
    private static int counter;
    private static int number = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    //konstruktor, et saaks kasutada ja luuda objekte
    public ThingsTogether(int age, String name) {
        this.age = age;
        this.name = name;
        counter++;
    }

    public static void main(String[] args) {

    ThingsTogether thingsTogether = new ThingsTogether(22,"Koit");

     thingsTogether.getAge();
     thingsTogether.getName();
     thingsTogether.SumNumbersNonStatic(2,4);
     SumNumbers(5,9);
        System.out.println(thingsTogether.returnWholeName());
     System.out.println(thingsTogether.returnName());

     System.out.println(thingsTogether.toString());
     ThingsTogether thingsTogether1 = new ThingsTogether(22,"Kadri!");
     //kirjutab üle
     thingsTogether1.setAge(23);
        System.out.println(thingsTogether1.getAge());
     thingsTogether1.setName("Kadrikas");
        System.out.println(thingsTogether1.getName());
        System.out.println(counter);
        //
        forLoops();
        whileLoop(9);

    }
    public String returnName(){
        return getName();

    }
    public String returnWholeName(){
        return "Hello";

    }
    //Staticut saab niisama välja kutsuda
    public static void SumNumbers(int a, int b){
//    a = 5;
//    b = 5;
    int ab = a + b;
        System.out.println(ab);
    }
    //NonStaticut saab välja kutsuda objekti abil
    public void SumNumbersNonStatic(int a, int b){
        int ab = a + b;
        System.out.println(ab);
    }
    public static void forLoops(){
        int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Array:"+i);
        }
    }
    public static void whileLoop(int correctNumber){
        //seni kaua kuni 0 on väiksem 9, tee!
while ( number < correctNumber ){
    number++;
    System.out.println("Koit on tore poiss!");
}
    }

}
