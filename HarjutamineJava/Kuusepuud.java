public class Kuusepuud {

    private static int raha;
    private static int koguMaksumus;


    public static void main(String[] args) {
ostaKuusepuud(1000);
kontrolliRaha();

    }
    public static void ostaKuusepuud(int kogus){
        koguMaksumus = kogus * 5;
        System.out.println("Kokku lähevad kuusepuud maksma:" + koguMaksumus + "eurot!");

    }
    public static void kontrolliRaha(){
        raha = 70000;
        int rahaAlles;
        if (raha < koguMaksumus){
            System.out.println("Ei saa seda osta!");
            rahaAlles = (koguMaksumus - raha);
            System.out.println("Raha on alles: " + rahaAlles + " eurot!");
        }else
        System.out.println("Tubli, ostetud!");
        rahaAlles = (raha - koguMaksumus);
        System.out.println("Raha on alles: " + rahaAlles + " eurot!");


    }
}
