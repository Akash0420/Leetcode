class Solution {
    public int reachNumber(int target) {
         target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        return step;
    }
}
/*   There are two situations:
1 you go to the right and reach the goal exactly.
2 you go over the goal, if you over by even number, then you can choose one of the steps that goes right to go left (the step is the half of what you go over), if you go over by odd number, then keep going until you are over by even number.
Eg-
[case 1] // target = 3
1 + 2 = 3 => sum-target = 3-3 => 'residual' is 0: this step '2' is the answer.


[case 2] // target = 2
1+2 = 3 // sum-target = 3-2 => 'residual' is 1: gone over by odd number => Can do nothing.
1+2+3 = 6 // sum-target = 6-2 => 'residual' is 4: gone over by even number => Flip 2 to add -4 (subtract 2*2)
1-2+3 = 2 // => this step '3' is the answer


[The following condition assures flipping only a number is sufficient.]


Flipping by only a number always has the meaning to subtract even integer.
The 'residual' cannot exceed 2 * (last number added to 'sum') because;
2*1 <= ... <= (even number of residual) < (N-1) + ('N' added to sum at step N) < 2 * N    */