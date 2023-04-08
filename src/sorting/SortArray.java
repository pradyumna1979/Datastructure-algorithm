package sorting;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sortArray(arr);
    }
    /*

Given a binary array, in-place sort it in linear time and constant space. The output should contain all zeroes, followed by all ones.

Input : [1, 0, 1, 0, 1, 0, 0, 1]
Output: [0, 0, 0, 0, 1, 1, 1, 1]

Input : [1, 1]
Output: [1, 1]

*/

        public static void sortArray(int[] nums)
        {
            int count = 0;
            for (int i=0;i<nums.length ;i++ ) {
                if(nums[i]==0){
                    nums[count++]=0;
                }
            }
            for(int i=count;i<nums.length;i++){
                nums[i]=1;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

