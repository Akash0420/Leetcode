/*we know it starts from 1, so

arr[mid] - (mid + 1)
will be the count of number that missed.

why l + k is the ans:-
We are maintaining such invariant throughout the loop: l + k <= ans <= r + k. Obviously when the array is missing k or more elements in the beginning, ans == k; when there is no missing elements, ans is arr.length + k;
When we update l = mid + 1, there are already mid + 1 non-missed elements on the left, and we still need k missed elements, so l + k <= ans still holds true;
When we update r = mid, we know ans is less than arr[mid], and on the left of mid, there are mid non-missed elements, plus k or more missed elements, so ans is at most mid + k;
Finally when l == r, we get l + k == ans == r + k */

class Solution {

    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] - (mid + 1) >= k) r = mid;  //missed more or equal than k numbers, left side;
            else l = mid + 1;   // missed less than k numbers, must be in the right side;
        }
        return l + k;
    }
}


/*In question it is mentioned that element are strictly increasing. we can use this info to find kth missing element.
let's take example where suppose every element in missing i.e. an empty array is passed.
1,2,3,4,5,6,7.....
so if k=1 answer is 1 , for k=2 answer is 2. and k=5 answer is 5
but now suppose input array is arr=[3]. so for k=5. our answer is 6 i.e(missing list - 1,2,4,5,6,7......)
so, we can observe that more the elements comes before k in arr the same number of times k will shift also. if 2 and 4 is input array and for k=5 ouput would be 7.
but if k asked is lo less that every element is missing with in k range. k is the output.
why? for example - arr=[4,6]
k=3, output=3
k=2,ouput=2
k=4, here 4 comes in between our missing element range from 1,4 hence k shifts one time and ouput will be 5.
apply above logic in a single loop. and answer will be k.

 public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<=k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }*/