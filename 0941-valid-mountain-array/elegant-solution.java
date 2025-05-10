class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        
        int i = 0;
        
        // Walk up
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        
        // Peak can't be first or last element
        if (i == 0 || i == arr.length - 1) {
            return false;
        }
        
        // Walk down
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        
        // Check if we reached the end
        return i == arr.length - 1;
    }
}