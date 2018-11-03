import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution4 {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        
        List<Interval> res = new LinkedList<>();
        Interval prev = null;
        for (Interval i : intervals) {
            if (prev == null || i.start > prev.end) {
                res.add(i);
                prev = i;
            } else if (i.end > prev.end) {
                prev.end = i.end;
            }
        }
        return res;
    }
    
    
}
    class Interval {
        int start = 0;
        int end = 0;
        
        Interval(int start, int end){ 
            this.start = start; 
            this.end = end; 
        }
    }
