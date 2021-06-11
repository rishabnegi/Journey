
public class TwoSum {

	public static void main(String[] args) {
		int nums[] = new int[] { 1, 7, 4, 9, 3 };

		int result[] = new TwoSum().twoSum(nums, 4);
		System.out.println(result[0] + " " + result[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		int result[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}

}
