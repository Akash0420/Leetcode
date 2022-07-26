class Solution {
    public int[] sumZero(int n) {
        int[] res= new int[n];
        int start=1;
        int left=0,right=n-1;
        while(left<right){
           res[left++]=start;
           res[right--] = -start;
            start++;
           }
        return res;
        }
        
    }
