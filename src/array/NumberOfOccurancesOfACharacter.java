package array;

public class NumberOfOccurancesOfACharacter {
    public static void main(String[] args) {
        String s="i am monoj good boy";

        int nouberOfTimes = numberOfOccurance(s,'o');
        System.out.println("Method 1 = "+nouberOfTimes);
        int count =numberOfOccuranceMethod2(s,'o');
        System.out.println("count = "+count);
    }
    public static int numberOfOccurance(String str,char ch){
       char[] charArray= str.toCharArray();
       //occurances of a
        int count = 0;
       for(char c : charArray){
           if(c == ch)
               count++;
       }
       return count;
    }
    //method2
    public static int numberOfOccuranceMethod2(String str,char ch){
       char[] charArray= str.toCharArray();
       int[] intArray = new int[128];
       for(char c : charArray){
           intArray[c]++;
       }
       int index = (int)ch;
       return intArray[index];
    }


}
