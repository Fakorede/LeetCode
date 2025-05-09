class Solution {
    // Time: O(n^2) - nested loops where n is the length of the array 
    // Space: O(1) - constant amount of extra space
    public boolean checkIfExist(int[] arr) {
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         // Trick: arr[j] can be twice arr[i]
        //         if (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]) {
        //             return true;
        //         }
        //     }
        // }

        // Alternative solution
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])) {
                    return true;
                }
            }
        }
  
        return false;

    }
}