public class TestingJeejee {
    public static void main(String[] args) {
    KatuseSobivus(540,590);
    }
    public static void KatuseSobivus(Integer AknaPindala, Integer katuseLoige){
        if(AknaPindala < katuseLoige){
            System.out.println("Ei sobi!");
        }else if(AknaPindala == katuseLoige){
            System.out.println("Sobib täpselt!");
        }else if(AknaPindala > katuseLoige){
            System.out.println("Liiga suur aken, vaheta väikema vastu!");
        }


    }
}
