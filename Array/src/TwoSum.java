import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int nums[] = new int[] { 1, 7, 4, 9, 3 };

		int result[] = new TwoSum().twoSum(nums, 4);
		System.out.println(result[0] + " " + result[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		int result[] = new int[2];
		
		Map<Integer,Integer> map=new HashMap<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
	
			if(map.get(target-nums[i])!=null) {
				
				result[0]=i;
				result[1]=map.get(target-nums[i]);
			}
			map.put(nums[i],i);
		}
		return result;
	}

}
