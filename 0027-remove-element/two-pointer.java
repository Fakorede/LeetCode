class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // pointer for position of the next non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
