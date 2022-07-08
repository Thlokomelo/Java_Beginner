package ex14_1_exercise;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    /*Change the divide method signature so that it throws 
      an ArithmeticException */
    public double divide(int x, int y) throws ArithmeticException {
        return x / y;
    }
}
