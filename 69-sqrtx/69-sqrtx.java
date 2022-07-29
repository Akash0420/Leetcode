class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        int ans=-1;
        
        if (x==0)
        return 0;
        
        while(start<=end){
            long mid= start + (end-start)/2;
            long midsq= mid*mid;
            
            if(midsq==x)
                return (int)mid;
            
            else if(midsq>x)
                end=(int)mid-1;
            
            else{
                start=(int)mid+1;
                ans=(int)mid;
            }
            }
        return ans;
    }
}

