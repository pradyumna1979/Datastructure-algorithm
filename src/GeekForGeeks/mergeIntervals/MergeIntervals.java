package GeekForGeeks.mergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void mergeInterval(Interval[] intervals, int n){
        Comparator<Interval> comparator = Comparator.comparingInt(o -> o.first);
        Arrays.sort(intervals, comparator);
        System.out.println(Arrays.toString(intervals));
        int index = 0;
        int i = 1;
        while(i <n){
            if(intervals[index].second >= intervals[i].first){
                intervals[index].second = intervals[i].second;
            }else{
                index++;
                intervals[index] = intervals[i];
            }
            i++;
        }
        System.out.println("index"+index);
        for(int j = 0; j <= index; j++ ){
            System.out.println(intervals[j]);
        }
    }
    public static void main(String[] args) {
        Interval [] intervals = new Interval[5];
        intervals[0] = new Interval(1,4);
        intervals[1] = new Interval(2,4);
        intervals[3] = new Interval(7,10);
        intervals[2] = new Interval(5,8);
        intervals[4] = new Interval(11,12);
        mergeInterval(intervals, intervals.length);

    }
}
class Interval {
    int first;
    int second;

    public Interval(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
