class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
    
int n = image.length;
        for (int[] row : image)
            for (int i = 0; i * 2 < n; i++)
                if (row[i] == row[n - i - 1])
                    row[i] = row[n - i - 1] ^= 1;
        return image;
    }
}