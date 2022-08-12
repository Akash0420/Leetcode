class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        while(i >= 0 && j >= 0) 
        {
            if(nums1[i] < nums2[j]) 
            {
                nums1[k--] = nums2[j--];
            }
            else
            {
                nums1[k--] = nums1[i--];
            }
        }
        while(j >= 0) 
        {
            nums1[k--] = nums2[j--];
        }
    }
}

/*The logic is written using the Two-Pointer Approach
Basically the main logic behind this approach is to start filling the from the largest element at the back of the array given to us.

Let’s consider an Example:
image

Initially p1 = m-1 , p2 = n-1 , i = m+n-1
So lets takes two pointers that mark the end of 2 arrays and i ,that would be the index at which we are going to write the value , now we will compare the values at p1 and p2 and write the value that is larger at index i , after writing we decrement the respective indexes .
And the another edge case is that if any one of the array is empty arr[i] = [0] , index i-1 and another one is arr[j] = [1,2,3] , index = j-1
So if we consider the index as i-1 then it becomes negative , which is ArrayIndexOutOfBounds ,so we have to take index >=0 .*/