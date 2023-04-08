package array.leaderOfAnArray;
/*
Ann element is an leader if it is greater then all the elements to its right
and last element is always a leader
 */
public class Leader {
    public static void main(String[] args) {
        int[] arr = {8,11,5,11,7,6,3};
        printAllLeaders(arr);//3 6 7 11

    }

    private static void printAllLeaders(int[] arr) {
        int current_leader = arr[arr.length-1];
        System.out.print(current_leader+" ");
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i] < current_leader)
                break;
            if(arr[i] > current_leader){
                current_leader = arr[i];
                System.out.print(current_leader+" ");
            }
        }

    }
}
