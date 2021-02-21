import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        //MATCH requires exactly the same. The WHOLE string must be the same
        //Match symbols
        boolean match1= "a".matches("."); //true. "." just one (any) character
        boolean match2="5".matches(".");   //true. "." just one character
        boolean match3="abc".matches(".*");//true. ".*" 0 or more than 1 characters
        boolean match4 = "abc".matches(".+"); //true. ".+" 1 or more characters
        boolean match5 = "a".matches("[abc]"); //true. "a" matches a, b or c
        boolean match6 = "ab".matches("[abc]"); //false. "ab" must be just 1 character
        boolean match7= "k".matches("[^abc]"); //true. "k" is not (^) "abc"
        boolean match8 = "b".matches("[a-k]"); //true. "b" is between range a-k
        boolean match9 = "b".matches("a|b"); //true. Must be either a or b
        boolean match10 = "ab".matches("ab|yu"); //true. either "ab" or "yu"
        //System.out.println("Introduce match to check");

        //Meta characters and quantifiers
        //Note "D", "S", and "W" mean the opposite to lowercase letters
        boolean meta1 = "6".matches("\\d"); //true. any digit
        boolean meta2 = "123".matches("\\d"); //false. Just one digit
        boolean meta3 = "a".matches("\\d"); //false. Must be a digit between 0 and 9
        boolean meta4 = "7".matches("\\D"); //false. "D" means NOT a digit
        boolean meta5 = "6".matches("[0-9]"); //true. Any digit within the range 0-9
        boolean meta6 = " k".matches("(\\s)(\\w)"); //true. A whitespace(w) followed by a word (w)
        boolean meta7 = "k".matches("\\S"); //true. A non-whitespace character
        boolean meta8 ="True".matches("[T|t]rue"); //True. Matches either True or true
        boolean meta9= "5".matches("^\\w"); //True. Means the same that "\\W"
        boolean meta10= "Hello".matches("\\w+"); //True. More than one word (only words, not symbols !"@#)
        boolean meta11 = "abc123".matches("\\w+\\d+");//True. More than a word and more than a digit
        boolean meta12 = "aa123".matches("\\w\\d+"); //False. Needs 1 word (even if \\d+ condition works)
        boolean meta13 = "aa".matches("a?");   //False. One or no times
        boolean meta14 = "aa".matches("\\w?"); //False. Same as meta13
        boolean meta15 = "aaa".matches("\\w{3}"); //True. Any word must occur 3 times
        boolean meta16 = "aaa".matches("\\w{2,5}"); //True. A word must occur at least 2 times and no more than 5
        boolean meta17 = "A".matches("(?i)a"); //True. ?i makes the regex case insensitive
        boolean meta18 = "hij".matches("([\\w&&[^b]])*"); //True. contains * number of words except b
        boolean meta19 = "Hi everyone".matches(".*(ev|yo).*"); //True. Either er or yo (and .* allows words before and after)
        //System.out.println(meta19);

        //Using a String as a pattern
        String regexPattern = "\\d+";
        System.out.println("1".matches(regexPattern));  //True
        System.out.println("abc".matches(regexPattern));  //False

        //Using Pattern class
        System.out.println(Pattern.matches("[abc]","b"));
        System.out.println("b".matches("[abc]"));



        //METHODS for Regular Expressions
        String input ="regex";
        //MATCH
        boolean method1 =input.matches("regex");    //True
        //SPLIT
        //Creates an array separated by the word, character provided (this word does not appear on the array)
        String [] splitString =input.split("g");
        for (String s: splitString){
            System.out.print(s);
        }
        System.out.println();
        //REPLACEFIRST
        //Replaces first "e" occurrence with "k"
        System.out.println(input.replaceFirst("e","k"));
        System.out.println();
        //REPLACEALL
        //Replace all "e" occurrence with h
        System.out.println(input.replaceAll("e","h"));
        System.out.println(input.replaceAll("\\w","!"));    //replace all words with !


        //GROUPING
        //Using Pattern and Matcher class to check a date
        Group1 g1= new Group1("03/03/1993");
        Group1 g2 = new Group1("03031993");

        //Change an input date
        Group2 g3= new Group2("03/03/1993");
        Group2 g4 = new Group2("03031993");


        //FLAG CASE INSENSITIVE
        Pattern pattern = Pattern.compile("[A-Z]",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("n");
        System.out.println(matcher.find());     //true
    }
}

class Group1{
    public Group1(String inputDate){
        final String DATE_PATTERN= "(0?[0-9])/(0?[0-9])/((?:19|20)[0-9][0-9])";
        Pattern datePattern = Pattern.compile(DATE_PATTERN); //Date format: DD/MM/YYYY,
        Matcher dateMatcher = datePattern.matcher(inputDate);
        if(dateMatcher.find()){
            System.out.println("The introduced date is correct");
        }else{
            System.out.println("Invalid date");
        }
    }
}

class Group2{
    public Group2(String inputDate){
        final String DATE_PATTERN = "(0?[0-9])/(0?[0-9])/((?:19|20)[0-9][0-9])";
        if (inputDate.matches(DATE_PATTERN)){
            System.out.println("The introduced date is correct");
        }
        else{
            String newDate= inputDate.replaceFirst("(\\d{2})(\\d{2})(\\d{4})", "$1/$2/$3");
            System.out.println("correct date: " + newDate);
        }
    }
}

