class Solution {
    public int[] twoSum(int[] numbers, int target) {

        /* for(int i=0; i<numbers.length-1; i++) {
        int start=i+1, end=numbers.length-1;
        int j=target-numbers[i];
        while(start <= end) {
            int mid= start+(end-start)/2;
            if(numbers[mid] == j){
                return new int[] {i+1,mid+1};}
            else if(numbers[mid] > j){
                end=mid-1;}
            else start=mid+1;
        }
    }
          return new int[]{ -1, -1 };
}
}*/


int start = 0, end = numbers.length - 1;
        while(start < end){
            if(numbers[start] + numbers[end] == target) break;
            if(numbers[start] + numbers[end] < target) start++;
            else end--;
        }
        return new int[]{start + 1, end + 1};
    }
}