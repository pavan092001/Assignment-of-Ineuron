

import java.util.Arrays;

public class Question8 {


    public static void main(String[] args) {
        //WAP to find the maximum occurring character in a String.
        String s = " navin reddy";
        s=s.toLowerCase();
        s = s.replaceAll("\\s", "");
        int maxCount =0;
        int i =0,j =0;
        int last =0;
        char[] p =s.toCharArray();
        Arrays.sort(p);
        char currentMax=p[0];
        int tempMax=0;
        char tempChar =p[0];
        boolean x = false;
        if(p[0] == p[p.length-1]){
            System.out.println("Maximum occurring Character is"+p[0]+"with occurrence");

        }
        while (i<p.length-1){
            j = i+1;
            if(p[i]!=p[j] || j == p.length-1){
                if(j == p.length-1 &&p[i] == p[j]){
                   tempMax = j -last+1;
                }
                else
                    tempMax = j-last;
                tempChar = p[i];
                last = j;
                x = true;
            }
            if(x){
                if(tempMax>=maxCount){
                    maxCount = tempMax;
                    currentMax = tempChar;
                    x = false;
                }
            }
            i++;
        }
        System.out.println("Maximum occurring Character is "+currentMax+" with occurrence "+maxCount);
    }
}
