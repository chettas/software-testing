public class Findingthecount {
    public static void main(String [] args){
        String str="The quick brown fox jumps over the lazy dog.";
        String[] word=str.split("\\s");
        int wordcount= word.length;
        System.out.println("word count is:"+wordcount);

    }
}
