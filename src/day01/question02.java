package day01;

/**
 给定一个排序数组(有序不重复)和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 输入: nums = [1,3,5,6], target = 5
 输出: 2
 **/
public class question02 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=0;
        int index=solution02(nums,target);
        System.out.println(index);
    }
    //方法一：自己动手的
    private static int solution01(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int result=-1;
        boolean isCunzai=false;
        while (l<=r){
            int mid=(l+r)/2;
            if (nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                result=mid;
                isCunzai=true;
                break;
            }
        }
        //如果该值不存在
        if (!isCunzai){
            for (int i = 0; i < nums.length; i++) {
                if (target<nums[i]){
                    result=i;
                }
            }
            if (target>nums[nums.length-1])
                result=nums.length-1;
        }
        return result;
    }
    //大佬解法
    private static int solution02(int[] nums, int target) {
        int lo=0,hi=nums.length-1;
        while(lo<hi){
            //求出中心点
            int pivot=lo+(hi-lo)/2;
            //判断中心点与目标元素关系
            if(target<nums[pivot]){
                hi=pivot-1;
            }else if(target>nums[pivot]){
                lo=pivot+1;
            }else{
                return pivot;
            }
        }
        return target>nums[lo]?lo+1:lo;
    }

}
