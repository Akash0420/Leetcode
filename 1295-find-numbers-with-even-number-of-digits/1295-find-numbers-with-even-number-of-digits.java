class Solution {
   /* static int NoofDigits(int n){
        int count=0;
        
        if(n == 0) {
           return 1;
        }
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }/*/
    public int findNumbers(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            //if(NoofDigits(nums[i]) % 2 == 0)
              //  res++;
            if (((int)(Math.log10(nums[i]))+1)%2==0){
                res++;
            }
        }
        return res;
    }
}
