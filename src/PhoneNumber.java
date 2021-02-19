import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) {
       int [] arrayNum = {1,2,3,4,5,6,7,8,9,0};
        //Option 1
       String input="";
       for(int i=0;i<arrayNum.length;i++){
            input=input+arrayNum[i];
        }
       String phoneNumber = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
       System.out.println(phoneNumber);

        System.out.println("-----");

       //Option 2
        String phoneN= new String("(XXX) XXX-XXXX");
        for(int i : arrayNum){
            phoneN=phoneN.replaceFirst("X",Integer.toString(i));
        }
        System.out.println(phoneN);
    }
}
