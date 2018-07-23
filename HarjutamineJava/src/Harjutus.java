public class Harjutus {
    public int getFirstGear() {
        return firstGear;
    }

    public void setFirstGear(int firstGear) {
        this.firstGear = firstGear;
    }

    public int getSecondGear() {
        return secondGear;
    }

    public void setSecondGear(int secondGear) {
        this.secondGear = secondGear;
    }

    int firstGear;
    int secondGear;

    public Harjutus(int firstGear, int secondGear) {
        this.firstGear = firstGear;
        this.secondGear = secondGear;
    }
    void Multiply(){
        if(firstGear > 3 || secondGear > 8){
            System.out.println("Vale ratas!");
        }else{

        int gears = firstGear * secondGear;
        System.out.println("Rattal on :" + gears + " " + "käiku!");
        }
    }
    public static void main(String[] args) {
        Harjutus harjutus = new Harjutus(1,7);
        harjutus.setFirstGear(1);
        harjutus.setSecondGear(8);
        harjutus.Multiply();
        System.out.println(harjutus.getFirstGear());
        System.out.println(harjutus.getSecondGear());
    }

}
