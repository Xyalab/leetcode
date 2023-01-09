package src.com.johnx.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JohnX
 * @date 2023/1/9 14:25
 * @Description: 两数之和   https://leetcode.cn/problems/two-sum/
 */
public class 两数之和 {

    public static void main(String[] args) {

        int nums[] = {2, 5, 9, 4, 6};

        System.out.println(Arrays.toString(twoSum2(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static int[] twoSum2(int[] nums, int target){
        int result[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(target - nums[i], i);
        }

        return result;
    }
}
