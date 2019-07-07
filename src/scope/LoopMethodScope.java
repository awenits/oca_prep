package scope;

public class LoopMethodScope {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }                                       //scope of i ends here
        //System.out.println(i);                //i cannot be accessed here
    }

    public void doStuff(int i){
        System.out.println(i);
    }                                           //scope of local variable i ends here
}