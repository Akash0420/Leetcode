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
/*class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}*/
