class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2)
                {
                    dfs(grid,i,j,2,row,col);
                }
            }
        }
        int maxtime=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1) return -1;
                if(grid[i][j]>2)
                {
                    maxtime=Math.max(maxtime,grid[i][j]-2);
                }
            }
        }
        return maxtime;
        
    }
    public void dfs(int[][] grid,int i,int j,int min,int row,int col)
    {
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0)
        {
            return;
        }
        if(grid[i][j]<min && grid[i][j]>1 )
        {
            return;
        }
        grid[i][j]=min;
        dfs(grid,i+1,j,min+1,row,col);
        dfs(grid,i-1,j,min+1,row,col);
        dfs(grid,i,j+1,min+1,row,col);
        dfs(grid,i,j-1,min+1,row,col);
    }
}