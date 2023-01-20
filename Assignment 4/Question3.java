

public class Question3 {
    public static void main(String[] args) {
        // WAP to check if “2552” is palindrome or not.
        String s = "2552";
        String s1;
        int i =0;
        boolean flag = true;
        int j = s.length()-1;
        while(i<=j){
            if(!((s.charAt(i)) ==s.charAt(j))){
                System.out.println("not palindrome");
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag)
            System.out.println("palindrome");

    }
}
