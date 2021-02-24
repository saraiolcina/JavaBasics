public class Exceptions {
    public static void main(String[] args) {
        CheckArray test1 = new CheckArray();
        test1.check(2);
        System.out.println("---------------");
        test1.check(15);
        System.out.println("---------------");
        //test1.check2(3);;
        System.out.println("---------------");
        test1.check2(7);
        System.out.println("---------------");
        test1.check3(6);
        System.out.println("---------------");
        test1.check3(7);
        System.out.println("---------------");
        test1.check4(2);
        System.out.println("---------------");
        test1.check4(3);
    }
}

class CheckArray{

    int [] array = {1,2,3,4,5,6,7,8,9,10};

    //TRY CATCH SYNTAX
    public void check(int n){
        try{
            System.out.println(array[n]);
        } catch(Exception e){
            System.out.println("The number is out of the array size");
        }
        finally{
            System.out.println("Thanks for trying!");
        }
    }
    /*try catch block allows us to handle exceptions ("errors") in order not to finish the application, but to
    * continue its execution until the end of it.
    * If there`s an error, instead of finishing the application, will return the catch instruction
    * Will reach "finally" block either there's or not an exception. Finally block is optional*/


    //THROW KEYWORD
    /*Allows us to "create" our own exceptions*/
    public void check2(int n){
        if(n<5){
            throw new ArithmeticException("You did not pass the exam");
        }
        else{
            System.out.println("Access granted!");
        }
    }
    /*throw new exceptions can be created with predefined exception types in java:
    * ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException,
    * SecurityException, etc*/


    //THROW KEYWORD. EXCEPTION INSTANCE
    public void check3(int n){
        try{
            if (n%2!=0){
                Exception OddException = new Exception("Not odd values allowed");
                throw OddException;
            }
            else{
                System.out.println(n);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();   //both instructions return Exception error. Different formats
        }
    }
    /*Also, throw keyword can be used with our own defined exceptions.
    We need to create an instance of Exception class, throw it and "call" its instructions from the catch block*/

    //THROW KEYWORD. EXCEPTION CLASS
    public void check4(int n){
        if(n==3){
            try{
                NumberThreeException e = new NumberThreeException("Number 3 is not allowed");
                throw e;
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }else{
            System.out.println(n);
        }
    }
    /*Same as before, we need to instance the exception, in this case, throw an own class we already created
    * In the catch block, we need to "call" the instructions, the message when finding an error*/
}

class NumberThreeException extends Exception{
    public NumberThreeException(String msg){
        super(msg);
        //System.out.println("NOT NUMBER 3"); //We could print here other message/instructions
    }
}
/*In the exception class constructor, we should define whats we want to do once an exception is created*/
