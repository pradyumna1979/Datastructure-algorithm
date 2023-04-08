package array.AllPairsWithGivenSum;

public class Method1 {
    public static void printAllPairs(int[] array, int n, int sum){
        for(int i=0; i < n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]+array[j] == sum){
                    System.out.println("( "+array[i]+","+ array[j]+" )");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,5,7,-1,5};
        int sum = 6;
        int n = array.length;
        printAllPairs(array,n,sum);
    }

}
