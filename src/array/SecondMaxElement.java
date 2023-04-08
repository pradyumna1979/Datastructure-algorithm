package array;

public class SecondMaxElement {
    public static void main(String[] args) {
        int[] array = {7,23,4,45,6,74, };
        int length = array.length;
        int secondMaxElement = secondMaxElement(array,length);
        System.out.println("Max element = "+secondMaxElement);

    }
    public static int secondMaxElement(int[] array, int length){
        int maxElement = 0;
        int secondMaxElement = 0;
        for(int i=0; i< length; i++){
            if (maxElement < array[i]) {
                secondMaxElement = maxElement;
                maxElement = array[i];
            } else if (secondMaxElement < array[i]) {
                secondMaxElement = array[i];
            }
        }
        return secondMaxElement;
    }

}
