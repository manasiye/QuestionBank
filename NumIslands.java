class Solution {
    
    public static int n;
    public static int m;
    
    public int numIslands(char[][] grid) {
     
        n= grid.length;
        if(n==0)return 0;
        m=grid[0].length;
        int count=0;

        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);        
                    count++;
                }
            }
        }
        return count;
    }
    
   public static void dfs(char mat[][], int i, int j) {
		if (i < 0 || j < 0 || i >= n || j >= m || mat[i][j] == '0')
			return;

		mat[i][j] = '0';
		dfs(mat, i + 1, j);
		dfs(mat, i - 1, j);
		dfs(mat, i, j + 1);
		dfs(mat, i, j - 1);
	}
}