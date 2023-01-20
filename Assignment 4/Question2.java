

public class Question2 {
    public static void main(String[] args) {

        //WAP to print Duplicates characters from the String.

        String s = "Pavan Chaudhari";
        int i =0;
        int j =0;

        while(i<s.length()-1){
            char p = s.charAt(i);
            j =i+1;
            while(j<s.length()){
                if(p == s.charAt(j)){
                    System.out.println(p);
                    break;
                }
                j++;
            }
            i++;
        }

    }
}
