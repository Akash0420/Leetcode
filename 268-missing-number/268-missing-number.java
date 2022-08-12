class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
        for(int j=0;j<n-1;j++){
            if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                
                swapped = true;
            }
        }
        if(!swapped)
            break;
        }
        int left = 0, right = nums.length, mid= (left + right)/2;
    while(left<right){
        mid = (left + right)/2;
        if(nums[mid]>mid) right = mid;
        else left = mid+1;
    }
    return left;
}
}