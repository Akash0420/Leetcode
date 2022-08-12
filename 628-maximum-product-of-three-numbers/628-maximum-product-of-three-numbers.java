class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}


/*solution could be to sort the given numsnums array(in ascending order) and find out the product of the last three numbers.

But, we can note that this product will be maximum only if all the numbers in numsnums array are positive. But, in the given problem statement, negative elements could exist as well.

Thus, it could also be possible that two negative numbers lying at the left extreme end could also contribute to lead to a larger product if the third number in the triplet being considered is the largest positive number in the numsnums array.

Thus, either the product nums[0] \times nums[1] \times nums[n-1]nums[0]×nums[1]×nums[n−1] or nums[n-3] \times nums[n-2] \times nums[n-1]nums[n−3]×nums[n−2]×nums[n−1] will give the required result. Thus, we need to find the larger one from out of these values.*/