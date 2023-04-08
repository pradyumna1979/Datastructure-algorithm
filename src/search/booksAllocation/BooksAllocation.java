package search.booksAllocation;

import java.util.Arrays;

public class BooksAllocation {
    public static void main(String[] args) {
        int[] books = {12,34,67,90};
        int students = 2;
        int result = maxPageBookAllocation(books,students);
        System.out.println(result);
    }

    private static int maxPageBookAllocation(int[] books, int students) {
        int low = Integer.MAX_VALUE,high = 0;

        for(int pages : books){
            if(pages<low){
                low=pages;
            }
            high= high+pages;
        }
        Student st=new Student(1,0,0);;
        while (low <= high){
            int mid = (low+high)/2;
            st.setPageCount(0);
            st.setNumberOfStudent(1);
            if (isValiedSolution(books,st,mid)) {
                st.setResult(mid);
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return st.getResult();
    }

    private static boolean isValiedSolution(int[] books, Student st, int mid) {
        for(int book : books){
            if(book>mid){
                return false;
            }
            if(st.getPageCount()+book <= mid){
                st.setPageCount(st.getPageCount()+book);
            }else{
                st.setNumberOfStudent(st.getNumberOfStudent()+1);
                if(st.getNumberOfStudent() >2)
                    return false;
                st.setPageCount(book);
            }
        }
        return true;
    }
}
