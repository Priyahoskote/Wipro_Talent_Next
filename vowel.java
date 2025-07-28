package college;
import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;

        for (char v : vowels) {
            if (ch == v) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }
}
