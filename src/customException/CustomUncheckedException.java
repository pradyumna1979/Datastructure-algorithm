package customException;

import java.util.Scanner;

public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException(String message) {
        super(message);
    }
    public CustomUncheckedException(String message,Throwable th) {
        super(message,th);
    }
    public CustomUncheckedException(Throwable th) {
        super(th);
    }

}
class CustomUncheckedExceptionTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter i : ");
        int i = scanner.nextInt();
        System.out.println("Enter k : ");
        int k = scanner.nextInt();
        try {

            int result = i / k;
            System.out.println("result :" + result);
        }catch (ArithmeticException ex){
            //throw new CustomUncheckedException(ex.getMessage());
            throw new CustomUncheckedException("k : vaue is zero",ex);
            //throw new CustomUncheckedException(ex);

        }
        System.out.println("k : "+k);
    }
}
