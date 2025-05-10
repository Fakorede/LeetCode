class Solution {
    // Two-pointer approach
    // Time Complexity - O(n) (each element is visited at most twice).
    // Space Complexity - Only two pointers (start and end) are used, no additional data structures are needed.
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int start = 0;
        int end = arr.length - 1;

        // Move start to the peak
        while (start < end && arr[start] < arr[start + 1]) {
            start++;
        }

        // Move end to the peak
        while (end > 0 && arr[end] < arr[end - 1]) {
            end--;
        }

        // Check if start and end meet at the same peak and it's not at the ends
        return start == end && start != 0 && end != arr.length - 1;
    }
}