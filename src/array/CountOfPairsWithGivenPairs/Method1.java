package array.CountOfPairsWithGivenPairs;

public class Method1 {
    public static int printAllPairs(int[] array, int n, int sum){
        int count = 0;
        for(int i=0; i < n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]+array[j] == sum){
                   count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1,5,7,-1,5};
        int sum = 6;
        int n = array.length;
        int count = printAllPairs(array,n,sum);
        System.out.println(count);
    }

}
