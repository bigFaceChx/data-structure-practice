package day01;

/**
 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 如果数组中不存在目标值 target，返回 [-1, -1]。

 输入：nums = [5,7,7,8,8,10], target = 8
 输出：[3,4]
 **/
public class question01 {
    public static void main(String[] args) {
        //有序数组
        int[] nums=new int[]{5,7,7,8,8,10,12,13,13,13,16,16,19};
        //查找的值
        int target=13;
        int[] erfenselect = erfenselect(nums, target);
        for (int i : erfenselect) {
            System.out.println(i);
        }
    }

    private static int[] erfenselect(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int start=-2;
        int end=0;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target) {
                left=mid+1;
            }else{
                start=mid;
                end=mid;
                while (start>=0&&nums[start]==target)
                    start--;
                while (end<nums.length&&nums[end]==target)
                    end++;
                break;
            }
        }
        return new int[]{start+1,end-1};
    }
}
