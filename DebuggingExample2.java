import java.util.Scanner;

public class DebuggingExample2 {

    private Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {
        new DebuggingExample2().run();
    }

    public void run() {
        String word = wordFromUser();
        reportOnVowelsFor(word);
    }

    private String wordFromUser() {
        System.out.print("Enter a word - I'll tell you what vowels it has > ");
        return kbd.nextLine();
    }

    private void reportOnVowelsFor(String word) {
        String vowelsFound = vowelsIn(word);
        if (vowelsFound.isEmpty()) {
            System.out.println("No vowels there!");
        } else {
            System.out.println("Found these vowels: " + vowelsFound);
        }

    }

    private String vowelsIn(String word) {
        int length = word.length();
        int i = 0;
        String vowelsFound = "";
        
        while (i < length) {
            String c = word.substring(i, i + 1);
            if (isVowel(c) && !vowelsFound.contains(c)) {
                vowelsFound += c;
            }
             i++;
        }
        return vowelsFound;
    }

    private boolean isVowel(String c) {
        return "AEIOU".contains(c);
    }

}
