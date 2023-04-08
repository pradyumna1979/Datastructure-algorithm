package array;

public class NumberOfDigits {
    public static void main(String[] args) {
        int num = 123454332;
        int noOfDigits = countNumerOfDigits(num);
        System.out.println(noOfDigits);
        System.out.println(countNumerOfDigits1(num));
    }

    private static int countNumerOfDigits(int num) {
        return  count(0,num);
    }
    private static int count(int count,int num){
        if(num==0){
            return count;
        }
        return count(count+1,num/10);
    }
    private static int countNumerOfDigits1(int num) {

        return  (int)Math.log10(num)+1;
    }

}
