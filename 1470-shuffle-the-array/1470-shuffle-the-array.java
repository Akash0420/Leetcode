class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
        int max = 1001; // M in the above explanation
        
		//Store number pairs in right half
        for(int i=n;i<nums.length;i++)
        {
            nums[i] = max*nums[i]+nums[i-n];
        }
		//Put pairs in proper positions
        int ind = 0;
        for(int i=n;i<nums.length;i++)
        {
            nums[ind] = nums[i]%max;
            nums[ind+1] = nums[i]/max;
            ind+=2;
        }
        
        return nums;
    }   
}
/*for(int i = 0; i < n; i++){
   res[2 * i] = nums[i];
   res[2 * i + 1] = nums[n+i];
}
return res;*/
