

public class Question4 {
    public static void main(String[] args) {
        //4. WAP to count the number of consonants, vowels, special characters in a String.
        String s ="Ineuron is $ one & of#! the best Institute";
        int i =0;
        char ch;
        int vowels=0;
        int consonant=0;
        int spCharacter =0;
        int number =0;
        while (i<s.length()){
            ch = s.charAt(i);
            if(isVovel(ch)){
                vowels++;
            } else if (isConsonant(ch)) 
                consonant++;
            else if (Character.isDigit(ch))
                number++;
            else if(ch == ' ');
            else
                spCharacter++;
            i++;
        }
        System.out.println(s);
        System.out.println("--------------The Data ------------- ");
        System.out.println("The number of vowels "+vowels);
        System.out.println("the number of consonats "+consonant);
        System.out.println("the number of digits is "+number);
        System.out.println("the number of special charcter"+spCharacter);

    }
    static boolean isVovel(char p){
        char[] vowles = {'a','e','i','o','u'};
        char c = Character.toLowerCase(p);
        int i =0;
        while(i<vowles.length){
            if(c == vowles[i])
                return true;
            i++;
        }
        return false;
    }
    static boolean isConsonant(char c){
        return ((c>= 65 &&c <=90) || (c>=97 && c<=122));
    }

}
