class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        int component =0;
        int[] visited = new int[n];
        for(int i =0; i <n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adjList.get(edge[1]).add(edge[0]);
            adjList.get(edge[0]).add(edge[1]);
        }
  
        for(int i =0;i < n; i++){
            if(visited[i] == 0){
               component++;
               dfs(adjList, visited, i);
            }
        }
       return component; 
    }

     private void dfs(List<List<Integer>> adjList, int[] visited, int startNode) {
        visited[startNode] = 1;
        for (int neighbor : adjList.get(startNode)) {
            if (visited[neighbor] == 0) {
                dfs(adjList, visited, neighbor);
            }
        }
    }
}