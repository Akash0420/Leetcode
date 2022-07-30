class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) { // peak index is after mid.
                low = mid + 1;
            }else if (arr[mid -1] > arr[mid]) { // peak index is before mid.
                high = mid;
            }else { // peak index is mid.
                return mid;
            }
        }
        return -1; // no peak.
    }
}