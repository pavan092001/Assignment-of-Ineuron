

import static java.lang.System.exit;

public class Question6 {
    public static void main(String[] args) {
        //WAP to implement Pangram Checking with least inbuilt methods being used.
        String s = "The quick own fox jumps over the lazy dog";

        s = s.toLowerCase();
        int i=0 ;
        char c = 97;
        boolean o = false;
        if(s.length()<26){
            System.out.println("Not pangram");
            return;
        }
        while (i<26){

            int j =0;
            o = false;
            while (j<s.length()) {
                if (c == s.charAt(j)) {
                    o = true;
                    break;
                }
                j++;
            }
            if(!o){
                System.out.println("not pangram");
                return;
            }
            i++;
            c++;
        }
        System.out.println("Panagram");
    }
}
