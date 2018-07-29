public class StaticCounter {
    static int count=0; //will get memory only once
    StaticCounter()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String args[])
    {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}

