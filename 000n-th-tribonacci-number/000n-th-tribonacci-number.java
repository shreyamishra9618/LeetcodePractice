class Solution {
    HashMap<Integer, Integer> map = new HashMap<>(){{
            put(0, 0);
            put(1, 1);
            put(2, 1);
    }};
    private int dfs(int i){
        if(map.containsKey(i)){
            return map.get(i);
        }
        int ans = dfs(i-1)+ dfs(i-2) + dfs(i -3);
        map.put(i, ans);
        return ans;
    }
    public int tribonacci(int n) {
        return dfs(n);  
    }
}