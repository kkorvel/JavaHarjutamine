import java.util.Scanner;

//klass
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public static void main(String[] args) {
        //java objekt

        Person person = new Person();
        person.setAge(11);
        person.setName("Meribel");
        System.out.println(person.getAge() + person.getName());
        //väljakutse
        Tervitus("Kotu");
        Returnija(11);
        Testing(0);
        Arvuti();
        Arvutajad(5,9);
        Tervitaja("Koit");
        Person p = new Person();
        p.Tervist("Koit");
    }
    public static void Tervitus(String name){
        System.out.println("Tere!" + name);
    }
    public static Integer Returnija(Integer vanus){
        System.out.println(vanus);
        return vanus;
    }
    //staticut saab niisama välja kutsuda
    public static void Testing(Integer kordaja){
        //väärtustamine
        String lipuke = "****************************";
        //for
        if(kordaja == 0){
            System.out.println("Vale!");
        }else{
        for(int i = 0; i < kordaja; i++){
        System.out.println(lipuke);
        }

        }
    }
    public static void Arvuti(){
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mis on a väärtus?");
        a = sc.nextInt();
        System.out.println("Mis on b väärtus?");
        b = sc.nextInt();
        int vastus = a + b;
        System.out.println("Sinu vastuseks on: " + vastus);
    }
    public  static Integer  Arvutajad(int a, int b){
        int vastus = a + b;
        System.out.println("Vastuseks on: " + vastus);
        return vastus;
    }
    public static String Tervitaja(String name){
        return "Tere" + name;
    }
    //non staticut saab kutsuda välja objekti kaudu!
    public void Tervist(String name){
        System.out.println("Tere" + name);
    }

}
