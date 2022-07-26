class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }   
        for(int i=0;i<freq.length;i++)
        {
            count +=(freq[i]*(freq[i]-1))/2;
        }
    
        return count;
    }
}

