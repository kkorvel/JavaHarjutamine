public class OpticFiber {
    private static final int paketiHind = 27;
    private static final int aastaHind = paketiHind * 12;
    public static void main(String[] args) {
arvutaHind(22,15);
    }
    public static void arvutaHind(int majadeArv, int aastad){
        int kokku = majadeArv * aastaHind * aastad;
        System.out.println(kokku);

    }
}
