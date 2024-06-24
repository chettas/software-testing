public class Findingmiddlechar {
    public static void main(String [] args){
        String str = "350";
        int middleindex;
        char middlechar;

                if(str.length() % 2==0){
                    middleindex=str.length()/ 2-1;
                    middlechar=str.charAt(middleindex);
                    System.out.println("the middle of the string (even)is:"+middlechar);

                }
                else{
                    middleindex=str.length()/2;
                    middlechar=str.charAt(middleindex);
                    System.out.println("the middle of the string (odd)is: "+middlechar);
                }
    }
}
