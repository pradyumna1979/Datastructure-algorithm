package GeekForGeeks.maxAndMinElementOfArray;

public class FindMaxAndMinElementInAnArrayByMinComp {
    public static void findMaxAndMin(int[] arr, int n){
        int max = 0;
        int min = 0;
        int i=0;
        if(n%2 == 0) {
            if (arr[0] < arr[1]) {
                max = arr[1];
                min = arr[0];
            } else {
                max = arr[0];
                min = arr[1];
            }
            i = i+2;
        }else{
            max = min = arr[0];
            i = 1;
        }
        while(i < n ){
            if(arr[i] > arr[i+1]) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i+1] < min) {
                    min = arr[i+1];
                }
            } else{
                if(arr[i] < arr[i+1]){
                    if(arr[i] < min){
                        min = arr[i];
                    }
                    if(arr[i+1] > max){
                        max = arr[i+1];
                    }
                }
            }
            i = i+2;
        }
        System.out.println("max = " +max);
        System.out.println("min = " +min);
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3,4,7};
        int n = arr.length;
        findMaxAndMin(arr,n);
    }
}
