package GeekForGeeks.dulicatesInAnArray;

public class DulicateElementsOptimumSolution {
    public static void printDuplicates(int[] arr, int n ){

        for(int i = 0; i < n; i++){
            arr[arr[i]%n] = arr[arr[i]%n]+n;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]/n > 1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,3,5,4,3};
        printDuplicates(arr, arr.length);
    }
}
