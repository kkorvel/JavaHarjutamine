import java.util.ArrayList;

public class Listid {

    public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    Listid listid = new Listid(22,"Koit");
    arrayList.add(listid);
        for (int i = 0; i < arrayList.size() ; i++) {

        System.out.println(listid.getNimi());
        }
    }

    public Integer getVanus() {
        return vanus;
    }

    public void setVanus(Integer vanus) {
        this.vanus = vanus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Listid(Integer vanus, String nimi) {
        this.vanus = vanus;
        this.nimi = nimi;
    }

    Integer vanus;
    String nimi;
}
