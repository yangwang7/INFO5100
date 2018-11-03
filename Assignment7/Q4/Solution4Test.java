import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution4Test{
	
    public static void main(String[] args) {
    	Solution4 s = new Solution4();
		List<Interval> list = new LinkedList<>();
		list.add(new Interval(1,3));
		list.add(new Interval(2,4));
		list.add(new Interval(5,7));
		list.add(new Interval(6,8));
		list.add(new Interval(10,12));
		list.add(new Interval(12,16));
		list.add(new Interval(17,18));
		List<Interval> res = s.merge(list);
		for(Interval i : res){
			System.out.println(i.start + "," + i.end);
		}
	}
}