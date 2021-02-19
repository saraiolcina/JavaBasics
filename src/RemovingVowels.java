import java.util.Scanner;

public class RemovingVowels {
    public static void main(String[] args) {
        //Option 1
        System.out.println("Introduce a sentence: ");
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String [] vowels = {"a","e","i","o","u", "A","E","I","O","U"};
        for(int i=0;i<str.length();i++){
            for (int j=0;j<vowels.length;j++){
                if(str.contains(vowels[j])){
                    str=str.replaceAll(vowels[j], "");
                }
            }
        }
        System.out.println(str);

        //Simplest option
        String s = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(s);
    }
}
