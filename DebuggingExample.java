import java.util.Scanner;

public class DebuggingExample {

    private Scanner kbd = new Scanner(System.in);

    public static void main(String[] args) {
        new DebuggingExample().run();
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
        String vowelsFound = "";

        for (int i = 0; i <= length; i++) {
            String c = word.substring(i, i + 1);
            if (isVowel(c) && !vowelsFound.contains(c)) {
                vowelsFound += c;
            }
        }
        return vowelsFound;
    }

    private boolean isVowel(String c) {
        return "AEIOU".contains(c);
    }

}
