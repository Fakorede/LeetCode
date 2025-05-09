class Solution {
    public int removeElement(int[] nums, int val) {
        int valCount = 0;
        int numsLength = nums.length;

        for (int num: nums) {
            if (num == val) valCount++;
        }

        int k = numsLength - valCount;

        // first k elements of num != val, others don't matter
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i+1;

            if (nums[i] == val) {
                for (; j <= nums.length - 1; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        i++;
                    } 
                }
                
            }
        }

        return k;
    }
}
