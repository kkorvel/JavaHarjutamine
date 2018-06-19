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
    }
    public static void Tervitus(String name){
        System.out.println("Tere!" + name);
    }
    public static Integer Returnija(Integer vanus){
        System.out.println(vanus);
        return vanus;
    }
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

}
