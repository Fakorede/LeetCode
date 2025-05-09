import java.util.HashSet;
import java.util.Set;

class Solution {
    // Time: O(n) - more efficient for larger arrays, Space: O(n) - for storing the elements in a set.
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            // check if either twice the number or half the number (if the number is even) exists in the set
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}