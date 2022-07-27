class Solution {
    public int[][] generateMatrix(int n) {
        int top,bottom,left,right,dir;
        top=0;
        bottom = n-1;
        left=0;
        right=n-1;
        dir=0;
        int count=1;
        int i;
        int[][] ans=new int[n][n];

        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(i=left;i<=right;i++)
                    ans[top][i]=count++;
                top++;

            }
            else if(dir==1)
            {
                for(i=top;i<=bottom;i++)
                    ans[i][right]=count++;;
                right--;
            }
            else if(dir==2)
            {
                for(i=right;i>=left;i--)
                    ans[bottom][i]=count++;;
                bottom--;
            }
            else if(dir==3)
            {
                for(i=bottom;i>=top;i--)
                    ans[i][left]=count++;
                left++;
            }
            dir=(dir+1)%4;
        }
        return ans;

    }
}