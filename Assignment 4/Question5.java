

import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {

    public static void main(String[] args) {

        //WAP to implement Anagram Checking least inbuilt methods being used.
        String s1 = "I wil Hokage ";
        String s2 = "I lliw beemoc egakoh";
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");
        if(s1.length()!= s2.length()){
            System.out.println("not Anagram");
            return;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] char1 =  toArray(s1);
        char[] char2 = toArray(s2);
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(isAnagram(char1,char2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }
    static char[] toArray(String s){
        char[] p = new char[s.length()];
        int i =0;
        while(i<s.length()){
            p[i]= s.charAt(i);
            i++;
        }
       return p;
    }
    static boolean isAnagram(char[] a,char[] b){
        int i=0;
        while(i<a.length){
            if(a[i] != b[i])
                return false;
            i++;
        }
        return true;
    }
}
