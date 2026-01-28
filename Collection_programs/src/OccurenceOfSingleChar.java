public class OccurenceOfSingleChar {
    public static void main(String[]args){
        String s= "Ruchi Tiwari";
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
