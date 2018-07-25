public class Koit {
    public int getVanus() {
        return vanus;
    }

    public void setVanus(int vanus) {
        this.vanus = vanus;
    }

    public String getPerekond() {
        return perekond;
    }

    public void setPerekond(String perekond) {
        this.perekond = perekond;
    }

    public int getLaste_arv() {
        return laste_arv;
    }

    public void setLaste_arv(int laste_arv) {
        this.laste_arv = laste_arv;
    }

    public String getNaise_nimi() {
        return naise_nimi;
    }

    public void setNaise_nimi(String naise_nimi) {
        this.naise_nimi = naise_nimi;
    }

    public Koit(int vanus, String perekond, int laste_arv, String naise_nimi) {
        this.vanus = vanus;
        this.perekond = perekond;
        this.laste_arv = laste_arv;
        this.naise_nimi = naise_nimi;
    }

    @Override
    public String toString() {
        return "Koit{" +
                "vanus=" + vanus +
                ", perekond='" + perekond + '\'' +
                ", laste_arv=" + laste_arv +
                ", naise_nimi='" + naise_nimi + '\'' +
                '}';
    }

    int vanus;
    String perekond;
    int laste_arv;
    String naise_nimi;

    public static void main(String[] args) {
        Koit koit = new Koit(22,"Kõrvel", 1, "Kadri");
        System.out.println(koit.toString());
    }

}
