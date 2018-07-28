public class Kuusepuud {

    private static int raha;
    private static int koguMaksumus;

    public static void main(String[] args) {
ostaKuusepuud(800);
kontrolliRaha();

    }
    public static void ostaKuusepuud(int kogus){
        koguMaksumus = kogus * 14;
        System.out.println("Kokku lähevad kuusepuud maksma:" + koguMaksumus + "eurot!");

    }
    public static void kontrolliRaha(){
        raha = 8000000;
        if (raha < koguMaksumus){
            System.out.println("Ei saa seda osta!");
        }else
        System.out.println("Tubli, ostetud!");


    }
}
