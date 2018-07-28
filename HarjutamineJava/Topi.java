public class Topi {
    @Override
    public String toString() {
        return "Topi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    private int id;
    private String name;

    public Topi(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) {
        Topi topi = new Topi(11,"Koit");
        //kirjutab üle
        topi.setId(111);
        topi.setName("Kotu");
        System.out.println(topi.toString());
        System.out.println(topi.getId() + topi.getName());
        //Väljund
//        "C:\Program Files\Java\jdk1.8.0_151\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.6\lib\idea_rt.jar=59994:C:\Program Files\JetBrains\IntelliJ IDEA 2017.2.6\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_151\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\rt.jar;D:\Kool\Javaprogemine\SuvineJava\out\production\SuvineJava" Topi
//        Topi{id=111, name='Kotu'}
//        111Kotu
//
//        Process finished with exit code 0
    }
}
