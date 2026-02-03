package basics;

import java.util.Scanner;
public class vowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter");
        String str = sc.nextLine().toLowerCase();
        int c = 0;
        int v = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                v += 1;
            } else if (a >= 'a' && a <= 'z') {
                c += 1;
            }
        }
        System.out.println("no of vowels is " + v + " no of consonants is " + c);
    }
}
