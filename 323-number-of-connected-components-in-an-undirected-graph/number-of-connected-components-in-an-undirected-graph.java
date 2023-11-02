class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[n];
        int comp =0;
        for(int i =0; i < n ; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        for(int i =0; i < n; i++){
            if(visited[i] ==0){
                comp++;
                dfs(adjList, visited, i);
            }
        }
        return comp;
    }
    private void dfs( List<List<Integer>> adjList,int[] visited, int idx){
        visited[idx] =1;
        for(int nei : adjList.get(idx)){
            if(visited[nei] == 0){
                dfs(adjList, visited, nei);
            }
        }
    }
}