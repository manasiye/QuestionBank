
import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

public class TwoSum {

	public static void main(String[] args) {
		int res[] = twoSum(new int[] { 2, 7, 11, 15 }, 9);
		System.out.println(res[0] + " " + res[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return new int[] { 0, 0 };
	}
}
