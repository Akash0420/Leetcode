class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long ps=mid*mid;
            if(ps==num)
                return true;
            if(ps>num)
                end=(int)mid-1;
            else
                start=(int)mid+1;
        }
        return false;
    }
}