

public class Question7 {
    public static void main(String[] args) {


        //WAP to find if String contains all unique characters.
        String s = "Computer lab";
        s = s.toLowerCase();
        boolean re = false;
        int i =0;
        int j =0;
        while(i<s.length()){
            j = i+1;
            while (j<s.length()){
                if(s.charAt(i) == s.charAt(j)){
                    re = true;
                    break;
                }
                j++;
            }
            if(re){
                System.out.println("don't contain Unique Character");
                break;
            }
            i++;
        }
        if(!re)
            System.out.println("contain all unique characters ");
    }
}
