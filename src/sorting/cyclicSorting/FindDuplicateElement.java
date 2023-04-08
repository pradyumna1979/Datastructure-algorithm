package sorting.cyclicSorting;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        cycleSort(arr);
        System.out.println(returnDuplicate(arr));
    }

    private static int returnDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return arr[i];
            }
        }
        return -1;
    }

    private static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    private static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
