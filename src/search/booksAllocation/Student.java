package search.booksAllocation;

public class Student {
    private int numberOfStudent;
    private int pageCount;
    private int result;

    public Student(int numberOfStudent, int pageCount, int result) {
        this.numberOfStudent = numberOfStudent;
        this.pageCount = pageCount;
        this.result = result;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberOfStudent=" + numberOfStudent +
                ", pageCount=" + pageCount +
                ", result=" + result +
                '}';
    }
}
