package GeekForGeeks.kthMaxAndMinElement;

import java.util.PriorityQueue;

public class UsingPriorityQueue {
    public static int kthMaxOrMinElement(int[] arr, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++ ){
            queue.add(arr[i]);
        }
        while(!queue.isEmpty()){
            if(count != arr.length-k){
                queue.poll();
            }else {
                return queue.poll();
            }
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int val = kthMaxOrMinElement(arr,2);
        System.out.println(val);
    }
}
