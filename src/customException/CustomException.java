package customException;

import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }
}
class CustomExceptionTest{
    public static void main(String[] args) throws CustomException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter i : ");
        int i = scanner.nextInt();
        System.out.println("Enter k : ");
        int k = scanner.nextInt();
        try {
            if(k==0)
                throw  new CustomException("in valid arguement : the value of k is 0");
            int result = i / k;
            System.out.println("result :" + result);
        }catch (CustomException ex){
            System.out.println("runtime exception : "+ex.getMessage());
        }
        System.out.println("k : "+k);
    }
}
