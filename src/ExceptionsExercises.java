public class ExceptionsExercises {
    public static void main(String[] args) {
        DivideByZero ex1 = new DivideByZero();
        ex1.division(9,6);
        ex1.division(8,0);
        MultipleCheck ex2 = new MultipleCheck();
        ex2.check(9,6);
        ex2.check(8,0);
        ex2.check(6,2);
    }
}

class DivideByZero{
    public void division(int n1, int n2){
        try{
            if(n2==0){
                Exception e = new Exception("You can't divide by zero!");
                throw e;
            }
            else{
                System.out.println(n1/n2);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

class MultipleCheck{
    public void check(int n1, int n2){
        try{
            if (n1%2!=0){
                Exception ex2 = new Exception();
                throw ex2;
            }
            System.out.println(n1/n2);
        }catch(ArithmeticException ex1){
            System.out.println("You can't divide by 0!");
        }catch (Exception ex2){
            System.out.println("Not odd numbers allowed");
        }
    }
}
