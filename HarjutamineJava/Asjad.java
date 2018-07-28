import java.util.ArrayList;
import java.util.Arrays;

public class Asjad {
    @Override
    public String toString() {
        return "Asjad{" +
                "vanus=" + vanus +
                ", nimi='" + nimi + '\'' +
                '}';
    }

    public Asjad(int vanus, String nimi) {
        this.vanus = vanus;
        this.nimi = nimi;
    }

    public int getVanus() {
        return vanus;
    }

    public void setVanus(int vanus) {
        this.vanus = vanus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    int vanus;
    String nimi;
    public static void main(String[] args) {

        ArrayList<String> asjadArrayList = new ArrayList<String>();
        asjadArrayList.add("Koit");
        asjadArrayList.add("Kadri");
        System.out.println(asjadArrayList);

        ArrayList<Asjad> korrasAsjad = new ArrayList<Asjad>();
        korrasAsjad.add(new Asjad(22,"Koit"));
        korrasAsjad.add(new Asjad(32,"Kadrikas"));

        for (int i = 0; i <korrasAsjad.size() ; i++) {
            System.out.println(korrasAsjad);
        }
        }
    }

