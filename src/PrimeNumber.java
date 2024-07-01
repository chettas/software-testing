import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] args){

        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the number:");

        int limit= scanner.nextInt();

        System.out.println("the prime number within "+limit+"is");

        for(int num = 2;num <= limit; num++) {
            if (isprime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static boolean isprime(int num){
            if(num <= 1) {
                return false;
            }
            for (int i =2; i*i <= num; i++){
                if( num % i ==0){
                    return false;
                }
            }
            return true;
        }


}
