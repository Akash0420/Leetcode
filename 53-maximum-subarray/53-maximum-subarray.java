class Solution {
    public int maxSubArray(int[] nums) {
        //int[] res=new int[];
        int curMaxSum=nums[0];
            int maxSumSofar=nums[0];
        for(int i=1;i<nums.length;i++){
            //int sum=0;
            //int max=nums[0];
            
            curMaxSum=Math.max( nums[i],curMaxSum+nums[i]);
            maxSumSofar=Math.max(curMaxSum,maxSumSofar);
        }
        return maxSumSofar;
    }
}