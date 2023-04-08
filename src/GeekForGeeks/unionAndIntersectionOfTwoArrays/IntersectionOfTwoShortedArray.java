 package GeekForGeeks.unionAndIntersectionOfTwoArrays;

public class IntersectionOfTwoShortedArray {

    public static void main(String[] args) {
    int[] a = {1,2,5,7,8,10,12};
    int[] b = {2,3,4,5,6,7,8,9,10,11,15,17,18,19,20};
    intersectionOfTwoArrays(a,b);
    }

    private static void intersectionOfTwoArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
             if(a[i] < b[j]){
                 i++;
             }
             else if(a[i] > b[j]){
                 j++;
             }
             else{
                 System.out.println(a[i++]);
                 j++;
             }
        }

    }
}
