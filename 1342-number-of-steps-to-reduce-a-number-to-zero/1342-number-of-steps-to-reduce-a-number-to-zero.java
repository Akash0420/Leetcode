class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if(num%2==0)
                num/=2;
            else
                num=num-1;
            steps++;
    }
        return steps;
}
}

/*Recursive approach
class Solution {
    public int numberOfSteps (int n) {
        if ( n == 0) {
            return 0;
        }
        
        return 1 + numberOfSteps(n % 2 == 0 ? n / 2 : n - 1);
    }
}*/