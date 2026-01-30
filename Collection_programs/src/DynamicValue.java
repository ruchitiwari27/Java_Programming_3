import java.util.Scanner;

public class DynamicValue {
    public static void main(String[]args)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        s= sc.nextLine();
        s = s.toLowerCase();

        int count=0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'r') {
                count++;
            }
        }
        System.out.println(count);
    }
}


