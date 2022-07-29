class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int no=nums[i];
            int position=no-1;
            if(no>=1 && no<n)
            {
               if(nums[position]!=no)
               {
               
                   int temp=nums[position];
                   nums[position]=nums[i];
                   nums[i]=temp;
                   i--;
               }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i+1!=nums[i])
                return i+1;
        }
        return n+1;
    }
        
}