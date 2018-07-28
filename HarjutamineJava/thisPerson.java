public class thisPerson {

    int id;
    String name;

    public thisPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static void main(String[] args) {
    thisPerson tp = new thisPerson(111,"Koit");

    System.out.println(tp.getId());
    System.out.println(tp.getName());
    }
}
