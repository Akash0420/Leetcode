class Solution {
    int count = 0; 
    public int findTargetSumWays(int[] nums, int target) {
        calculate(nums, 0, 0, target);
        return count;
    }
    
    public void calculate(int[] nums, int i, int sum, int target) {
        if (i == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            calculate(nums, i + 1, sum + nums[i], target);
            calculate(nums, i + 1, sum - nums[i], target);
        }
    }
    }

/*given solution on lc
The brute force approach is based on recursion. We need to try to put both the + and - symbols at every location in the given numsnums array and find out the assignments which lead to the required result SS.

For this, we make use of a recursive function calculate(nums, i, sum, S), which returns the assignments leading to the sum SS, starting from the i^{th}i 
th
  index onwards, provided the sum of elements up to the i^{th}i 
th
  element is sumsum. This function appends a + sign and a - sign both to the element at the current index and calls itself with the updated sumsum as sum + nums[i]sum+nums[i] and sum - nums[i]sum−nums[i] respectively along with the updated current index as i+1i+1. Whenever we reach the end of the array, we compare the sum obtained with SS. If they are equal, we increment the countcount value to be returned.

Thus, the function call calculate(nums, 0, 0, S) returns the required number of assignments.

Complexity Analysis
Time complexity: O(2^n)

 . Size of recursion tree will be 2^n. n refers to the size of numsnums array.

Space complexity: O(n). The depth of the recursion tree can go up to n.
*/