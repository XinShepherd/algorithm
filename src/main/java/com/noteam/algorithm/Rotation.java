package com.noteam.algorithm;

/**
 * Created on 2019/9/1.
 *
 * @author Shepherd
 */
public class Rotation {

    /*
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     * 请找出其中最小的元素。
     * 你可以假设数组中不存在重复元素。
     */
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("Invalid array");
        }
        int index1 = 0;
        int index2 = nums.length - 1;
        int midIndex = index1;
        // 由于没有重复元素，可以简化，不需要等于号
        while (nums[index1] > nums[index2]) {
            if (index2 - index1 == 1) {
                midIndex = index2;
                break;
            }
            midIndex = (index1 + index2) / 2;
            if (nums[midIndex] > nums[index1]) {
                index1 = midIndex;
            } else if (nums[midIndex] < nums[index2]) {
                index2 = midIndex;
            }
        }
        return nums[midIndex];
    }

}
