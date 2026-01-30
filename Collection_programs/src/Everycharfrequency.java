//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class Everycharfrequency {
//    public static void main(String[]args) {
//        String s;
//        Scanner sc = new Scanner(System.in);
//        s = sc.next();
//        s = s.toLowerCase();
//
//        HashSet<Character> hs = new HashSet<>();
//
//        for (int i = 0; i < s.length(); i++) {
//                    hs.add(s.charAt(i));
//                    if()
//                }
//
//                // Step 2: Count frequency of each unique character
//                for (char ch : hs) {
//                    int count = 0;
//                    for (int i = 0; i < s.length(); i++) {
//                        if (s.charAt(i) == ch) {
//                            count++;
//                        }
//                    }
//
//                    System.out.println(ch + " : " + count);
//                    System.out.println(""+count1);
//                }
//
//            }
//
//        }
//
//
//
import java.util.Scanner;

public class Everycharfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.nextLine();
        s = s.toLowerCase();   // optional

        int[] freq = new int[256]; // ASCII characters

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}
