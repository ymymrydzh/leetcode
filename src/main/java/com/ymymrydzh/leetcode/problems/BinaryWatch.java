/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 033172
 * @date 2019-01-14 18:26:08
 * @description A binary watch has 4 LEDs on the top which represent the hours
 *              (0-11), and the 6 LEDs on the bottom represent the minutes
 *              (0-59). Each LED represents a zero or one, with the least
 *              significant bit on the right.
 * 
 *              <li>0011
 *              <li>011001
 * 
 *              For example, the above binary watch reads "3:25".
 * 
 *              Given a non-negative integer n which represents the number of
 *              LEDs that are currently on, return all possible times the watch
 *              could represent.
 * 
 *              Example:
 * 
 *              Input: n = 1 Return: ["1:00", "2:00", "4:00", "8:00", "0:01",
 *              "0:02", "0:04", "0:08", "0:16", "0:32"]
 * 
 *              Note:
 *              <li>The order of output does not matter.
 *              <li>The hour must not contain a leading zero, for example
 *              "01:00" is not valid, it should be "1:00".
 *              <li>The minute must be consist of two digits and may contain a
 *              leading zero, for example "10:2" is not valid, it should be
 *              "10:02".
 */
public class BinaryWatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryWatch b = new BinaryWatch();
		List<String> times = b.readBinaryWatch(2);
		System.out.println(Arrays.toString(times.toArray()));
	}

	public List<String> readBinaryWatch(int num) {
		List<String> times = new ArrayList<>();
		for (int hourc = 0; hourc < 4; hourc++) {
			if (num - hourc > -1 && num - hourc < 6) {
				char[] hour = { '0', '0', '0', '0', };
				char[] minute = { '0', '0', '0', '0', '0', '0', };
				List<Integer> hours = read(hour, hourc, 0, 3);
				List<Integer> minutes = read(minute, num - hourc, 0, 5);
				times.addAll(readWatch(hours, minutes));
			}
		}
		return times;
	}

	private List<Integer> read(char[] btime, int count, int start, int end) {
		List<Integer> times = new ArrayList<>();
		if (count == 0) {
			times.add(0);
		} else {
			for (; end - start + 1 >= count; start++) {
				char[] timec = btime.clone();
				timec[start] = '1';
				if (count == 1) {
					int time = Integer.valueOf(new String(timec), 2);
					if ((end == 3 && time < 12) || (end == 5 && time < 60)) {
						times.add(time);
					}
				} else {
					times.addAll(read(timec, count - 1, start + 1, end));
				}
			}
		}
		return times;
	}

	private List<String> readWatch(List<Integer> hours, List<Integer> minutes) {
		List<String> times = new ArrayList<>();
		for (int i = 0; i < hours.size(); i++) {
			for (int j = 0; j < minutes.size(); j++) {
				times.add(hours.get(i) + ":" + (minutes.get(j) < 10 ? "0" : "") + minutes.get(j));
			}
		}
		return times;
	}
}
