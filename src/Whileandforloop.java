public class Whileandforloop {
    void whileloop() {
        int a= 1;
        while (a < 10) {
            System.out.println("The value of a is:" + a);
            a++;
        }

    }

    void forloop() {
        for ( int i = 2; i <23; i+=2) {
            System.out.println(" The even number" + i );
        }
    }
    public static void main (String[]args){
        Whileandforloop object = new Whileandforloop();
        object.whileloop();
        object.forloop();
    }
}


