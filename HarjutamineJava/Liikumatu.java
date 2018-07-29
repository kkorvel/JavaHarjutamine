public class Liikumatu {
    public Liikumatu(String nimi) {
        this.nimi = nimi;
        counter++;
        System.out.println(counter);
    }

    private String nimi;
    private static int counter = 0;

    public static void main(String[] args) {
        Liikumatu liikumatu = new Liikumatu("Koit");
        Liikumatu ss = new Liikumatu("Koit");
        Liikumatu dd = new Liikumatu("Koit");

    }

}
