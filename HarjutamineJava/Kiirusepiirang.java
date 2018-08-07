public class Kiirusepiirang {
    private static final int kiirus = 90;

    public static void main(String[] args) {
        Kiirus(59);
    }
    public static void Kiirus(int minuKiirus) {
        if (minuKiirus > kiirus) {
            System.out.println("Ületasid kiirust");
        }else if(minuKiirus < kiirus){
            System.out.println("Liiga aeglaselt sõitsid!");
        }




    }
}
