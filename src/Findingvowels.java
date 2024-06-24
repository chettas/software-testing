public class Findingvowels {
    public static void main(String[] args) {
        String str = "w3resource";
        int vowelscount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(ch = str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelscount++;
            }
        }
        System.out.println("the number of vowles in the string is:" + vowelscount);
    }
}

