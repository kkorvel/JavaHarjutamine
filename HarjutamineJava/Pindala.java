public class Pindala {
    public String getKatusenimi() {
        return katusenimi;
    }

    public void setKatusenimi(String katusenimi) {
        this.katusenimi = katusenimi;
    }

    public Integer getKatuseMaksumus() {
        return katuseMaksumus;
    }

    public void setKatuseMaksumus(Integer katuseMaksumus) {
        this.katuseMaksumus = katuseMaksumus;
    }

    public String getTööMeesNimi() {
        return tööMeesNimi;
    }

    public void setTööMeesNimi(String tööMeesNimi) {
        this.tööMeesNimi = tööMeesNimi;
    }

    @Override
    public String toString() {
        return "Pindala{" +
                "katusenimi='" + katusenimi + '\'' +
                ", katuseMaksumus=" + katuseMaksumus +
                ", tööMeesNimi='" + tööMeesNimi + '\'' +
                '}';
    }

    String katusenimi;
    Integer katuseMaksumus;
    String tööMeesNimi;

    public static void main(String[] args) {
        PindalaArvutaja(20,40);
        Pindala pindala = new Pindala();
        pindala.katuseMaksumus = 584;
        pindala.katusenimi = "Velux";
        pindala.tööMeesNimi = "Koit";
        System.out.println(pindala.toString());
        System.out.println(pindala.getKatuseMaksumus().toString());

    }
    public static void PindalaArvutaja(int a, int b){
        Integer pindala = a * b;
        System.out.println(pindala);

    }
}
