class Solution {
    public boolean exist(char[][] board, String word) {
      /*Find word's first letter.  Then call method to check it's surroundings */
        for(int r=0; r<board.length; r++)
            for(int c=0; c<board[0].length; c++)
                if(board[r][c]==word.charAt(0) && help(board,word,0,r,c))
                    return true;
        
        return false;
    }
    
    public boolean help(char[][] board, String word, int start, int r, int c){
        /* once we get past word.length, we are done. */
        if(word.length() <= start)
            return true;
        
        /* if off bounds, letter is seen, letter is unequal to word.charAt(start) return false */
        if(r<0 ||c<0 || r>=board.length || c>=board[0].length || board[r][c]=='0' || board[r][c]!=word.charAt(start))
            return false;
        
        /* set this board position to seen. (Because we can use this postion) */
        char tmp = board[r][c];
        board[r][c] = '0';
        
        /* recursion on all 4 sides for next letter, if works: return true */
        if(help(board,word,start+1,r+1,c) ||
          help(board,word,start+1,r-1,c) ||
          help(board,word,start+1,r,c+1) ||
          help(board,word,start+1,r,c-1))
            return true;
        
        //Set back to unseen
        board[r][c] = tmp;
        
        return false;
    }
}

/*public boolean exist(char[][] board, String word) {
    char[] w = word.toCharArray();
    for (int y=0; y<board.length; y++) {
    	for (int x=0; x<board[y].length; x++) {
    		if (exist(board, y, x, w, 0)) return true;
    	}
    }
    return false;
}

private boolean exist(char[][] board, int y, int x, char[] word, int i) {
	if (i == word.length) return true;
	if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
	if (board[y][x] != word[i]) return false;
	board[y][x] ^= 256;
	boolean exist = exist(board, y, x+1, word, i+1)
		|| exist(board, y, x-1, word, i+1)
		|| exist(board, y+1, x, word, i+1)
		|| exist(board, y-1, x, word, i+1);
	board[y][x] ^= 256;
	return exist;
}*/

/*public class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }
        
        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) || 
           search(board, word, i+1, j, index+1) ||
           search(board, word, i, j-1, index+1) || 
           search(board, word, i, j+1, index+1)){
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
}*/