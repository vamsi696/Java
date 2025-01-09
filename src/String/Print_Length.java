package String;

public class Print_Length {
    public static void main(String[] args) {
        String s = "Coding on Codechef";

        String[] words = s.split(" ");
        for (String word : words){
            System.out.println(word +" - "+ word.length());
        }
        System.out.println(s +" - " + s.length() );
    }
}
