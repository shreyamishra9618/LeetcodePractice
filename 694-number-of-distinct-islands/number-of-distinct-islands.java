class Solution {
    private int[][] grid;
    private boolean[][] seen;
    private Set<Pair<Integer, Integer>> currentIsland;
    private int currRowOrigin;
    private int currColOrigin;
    public int numDistinctIslands(int[][] grid) {
        this.grid = grid;
        this.seen = new boolean[grid.length][grid[0].length];
        Set<Set<Pair<Integer,Integer>>> islands = new HashSet<>();
        for(int i =0; i < grid.length; i++){
            for(int j =0; j < grid[0].length; j++){
                this.currentIsland = new HashSet<>();
                this.currRowOrigin = i;
                this.currColOrigin =j;
                dfs(i,j);
                if(!currentIsland.isEmpty()) islands.add(currentIsland);
            }
        }
        return islands.size();
        
    }
    private void dfs(int row, int col){
        if(row <0 || row >= grid.length || col <0 || col >= grid[0].length || grid[row][col] == 0 || seen[row][col] ) return;
        seen[row][col] = true;
        currentIsland.add(new Pair<>(row - currRowOrigin, col - currColOrigin));
        dfs(row +1, col);
        dfs(row -1, col);
        dfs(row, col +1);
        dfs(row, col -1);
    }
}