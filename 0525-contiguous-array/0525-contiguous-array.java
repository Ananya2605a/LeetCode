import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                sum--;
            } else {
                sum++;
            }

            if (map.containsKey(sum)) {
                int length = right - map.get(sum);
                max = Math.max(max, length);
            } else {
                map.put(sum, right);
            }
        }

        return max;
    }
}