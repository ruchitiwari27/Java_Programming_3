import java.util.Scanner;

public class DynamicValue_2 {
    public static void main(String[]args)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        s= sc.nextLine();
        s = s.toLowerCase();

        char ch ;
        Scanner cs= new Scanner(System.in);
        String a = cs.next();
        a=a.toLowerCase();
        ch=a.charAt(0);


        int count=0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
        //System.out.println(""+ch);
    }
}
