public class Datatypes {
    public static void intmethod(int a,int b){
        System.out.println("addition of a+b=" +(a+b));
    }
    public static void doublemethod(double a, double b){
        System.out.println("multiply of a*b=" + (a*b));
    }
    public static void longmethod(long a, long b){
        System.out.println("Division of a/b="  + (a/b));

    }
    public static void booleanmethod(boolean a, boolean b){
        System.out.println("the value of boolean is=" + (a+" " + b));

    }

    public static void main (String [] args){

        intmethod(10,20);
        doublemethod(30,20);
        longmethod(3000,584);
        booleanmethod(true,false);


    }


}


