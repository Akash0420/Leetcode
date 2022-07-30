class Solution {
    public int countNegatives(int[][] grid) {
     /*   int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0)
                    count++;
            }
        }
        return count;
    }
}*/
       //O(m*logn)//
        int count = 0;
		for (int i = 0, end = grid[i].length - 1;i < grid.length; i++) {
            int start=0;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (grid[i][mid] < 0) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			count = count + grid[i].length - start;
	
		}
		return count;
    }
}