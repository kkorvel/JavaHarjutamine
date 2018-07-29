public class StaticMembers {

    private  String firstName;
    private  String lastName;
    //liikumatu muutuja ehk ei nullita ära
    private static int members = 0;

    public StaticMembers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        members++;
        System.out.println(members);
    }

    public static void main(String[] args) {
        StaticMembers staticMembers = new StaticMembers("Koit","SSSSS");
        StaticMembers ssss = new StaticMembers("Koit","SSSSS");
        StaticMembers dddd = new StaticMembers("Koit","SSSSS");
        StaticMembers aaa = new StaticMembers("Koit","SSSSS");
        //ilma static int members = 0;
//        1
//                1
//                        1
//                                1
        //static int members = 0;
//        1
//                2
//                        3
//                                4
    }
}
