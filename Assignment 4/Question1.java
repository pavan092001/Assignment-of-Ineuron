

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String s;
        Scanner i = new Scanner(System.in);
        System.out.println("enter the string ");
        s = i.next();
        StringBuilder p = new StringBuilder();
        int a = 0;
        while(a<s.length()){
            int b =0;
            boolean flag = true;
            while(b<p.length()){
                if(s.charAt(a) == p.charAt(b)){
                    flag = false;
                    break;
                }
                b++;
            }
            if(flag){
                p.append(s.charAt(a));
            }
            a++;
        }
        String result = p.toString();
        System.out.println("the String without duplicates is "+result);
    }
}
