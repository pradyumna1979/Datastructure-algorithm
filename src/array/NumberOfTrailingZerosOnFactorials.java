package array;

public class NumberOfTrailingZerosOnFactorials {
    public static void main(String[] args) {
        int num =25;
        int numberOf2s = numberOfZeros(num,2);
        int numberOf5s= numberOfZeros(num,5);
        System.out.println(Math.min(numberOf2s,numberOf5s));
    }

    private static int numberOfZeros(int num, int diviser) {
        int sum1 = 0;
        int k =1;
        while(num >= (int)Math.pow(diviser,k)){
            sum1 = (int) (sum1+Math.abs(num/Math.pow(diviser,k)));
            k++;
        }
        return sum1;
    }

}
