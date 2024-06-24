public class Smallestnumber {
    public static void main (String [] args0){
        int[] numbers = {37,25,29};
        int min = numbers[0];
        for ( int num : numbers ){
            if (num < min){
                min = num;
            }
        }
        System.out.println("the smallest number is:" + min );
        }
    }