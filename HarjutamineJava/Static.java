public class Static {
    private static int counter;

    public Static(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {
    int nonStaticCounter = 0;
    Static.counter++;
    nonStaticCounter++;
        System.out.println(counter);
        System.out.println(nonStaticCounter);

       Static aStatic = new Static("Koit");
        Static sss = new Static("Meribel");
        Static ddd = new Static("Kadri");
        Static aaa = new Static("Merike");
        Static ccc = new Static("Einar");
        System.out.println(aStatic);
        nonStaticCounter++;
        counter++;
        System.out.println(sss);
        nonStaticCounter++;
        counter++;
        System.out.println(aaa);
        nonStaticCounter++;
        counter++;
        System.out.println(ddd);
        nonStaticCounter++;
        counter++;
        System.out.println(ccc);
        nonStaticCounter++;
        counter++;



        System.out.println("NonStatic: " + nonStaticCounter);

        System.out.println("Static: " + counter);
    }
}
