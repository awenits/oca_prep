package scope;

public class Scope {
    private static int y = 99;

    public static void main(String[] args) {
        int x = y;
        {
            //x = d;
            int j = 100;
            System.out.println("Value of j: " + j + " and x: " + x);
            int d = 100;
            x = d;
        }                            //scope of j and d ends here
        //System.out.println(j);    //j is out of scope
        //System.out.println(d);    //d is out of scope
        System.out.println(x);
    }                               //scope of x ends here
}
