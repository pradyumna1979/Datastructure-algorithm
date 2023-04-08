package GeekForGeeks.dulicatesInAnArray;

public class DulicateElements {
    public static void printDuplicates(int[] arr, int n ){
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[arr[i]]++;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,3,5,4,3};
        printDuplicates(arr, arr.length);
    }
}
