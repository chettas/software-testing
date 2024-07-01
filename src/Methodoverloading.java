public class Methodoverloading {
 public static int add(int a,int b){
    return a+b;

                 }
 public static double add(double a, double b){
     return a+b;
            }

 public static void main (String [] args){
     int intsum= add(10 ,15);
     double intdouble=add(27.5,32.6);
     System.out.println("the value of the sum is:"+intsum);
     System.out.println("the value of the double is:"+intdouble);
    }
}
