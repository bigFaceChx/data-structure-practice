package day02;

import java.util.Arrays;
import java.util.HashMap;

/**
 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 你可以按任意顺序返回答案。

 输入：nums = [2,7,11,15], target = 9
 输出：[0,1]
 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 **/
public class question01 {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,-5};
        int target=-8;
        int[] result=solution02(nums,target);
        System.out.println(Arrays.toString(result));
    }
    //暴力破解
    private static int[] solution01(int[] nums, int target) {
        int one=0;
        int two=0;
        outer:for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i]+nums[j]==target){
                        one=i;
                        two=j;
                        break outer;
                    }
                }
        }
        return new int[]{one,two};
    }
    //哈希表解法
    private static int[] solution02(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return  new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}
