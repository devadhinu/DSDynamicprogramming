package TwoDimesionalArrays;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class MergeIntervals {

	/*
	 * 56. Merge Intervals
	 * 
	 * Given an array of intervals where intervals[i] = [starti, endi], merge all
	 * overlapping intervals, and return an array of the non-overlapping intervals
	 * that cover all the intervals in the input. cd
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
	 * 
	 * Output: [[1,6],[8,10],[15,18]]
	 * 
	 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: intervals = [[1,4],[4,5]]
	 * 
	 * Output: [[1,5]]
	 * 
	 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
	 * 
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= intervals.length <= 104 intervals[i].length == 2 0 <= starti <= endi
	 * <=104
	 * 
	 */

	private static final Month DEC = null;

	@Test
	public void example() {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		merge(intervals);
	}

	@Test
	public void example2() {
		int[][] intervals = { { 1, 9 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		merge(intervals);
	}

	public int[][] merge(int[][] intervals) {

		System.out.println(Arrays.deepToString(intervals));

		// Arrays.sort(intervals, (a,b) -> {if (a[1]!=b[1]) return a[1] - b[1];else
		// return a[0] - b[0];});

		Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

		// a[0] =1 b[0]=2 a[1]=3 b[1]=6

		System.out.println(Arrays.deepToString(intervals));
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> lst = new ArrayList<>();
        int[] current_Interval = intervals[0];
        lst.add(current_Interval);

        for(int[] interval : intervals){
            int current_start = current_Interval[0];
            int current_end = current_Interval[1];
            int next_start = interval[0];
            int next_end = interval[1];

            if(current_end >= next_start){
                current_Interval[1] = Math.max(current_end,next_end);
            } else {
                current_Interval = interval;
                lst.add(current_Interval);
            }
        }
        return lst.toArray(new int[lst.size()][]);
    }
}
