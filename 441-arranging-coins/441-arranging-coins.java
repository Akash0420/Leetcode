class Solution {
    public int arrangeCoins(int n) {
        long start=0;
        long end=n;
        
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long count= mid*(mid+1)/2;
            
            if(count==n)
                return (int)mid;
            
            if(n<count){
                end=(int)mid-1;
            }
            else{
                start=(int)mid+1;
            }
            
        }
        return (int)end;
    }
}