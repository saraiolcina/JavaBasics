import java.util.Scanner;

public class RegularExpressionsExercises {
    public static void main(String[] args) {

        //Ex. PhoneNumber: Convert a given int array into a valid phone number with format: (XXX) XXX-XXXXX
        /*int [] numberArray = {1,4,7,2,5,8,3,3,6,6,9};
        PhoneNumber number1 = new PhoneNumber();
        System.out.println(number1.verifyPhone(numberArray));    */

        //Ex. RemovingVowels: Remove vowels from a given String
        RemovingVowels string1 = new RemovingVowels();
        System.out.println(string1.remover());
    }
}

class PhoneNumber {
    public String verifyPhone(int[] array) {
        String input = "";
        for (int i : array) {
            input=input+array[i];
        }
        input=input.replaceFirst("(\\d{3})(\\d{3})(\\d+)","($1) $2-$3");
        return input;
    }
}

class RemovingVowels{
    String input="";
    public RemovingVowels(){
        Scanner reader = new Scanner (System.in);
        System.out.println("Introduce a String: ");
        this.input=reader.nextLine();
    }
    public String remover(){
        String newString =input.replaceAll("[aAeEiIoOuO]", "");
        return newString;
    }
}



