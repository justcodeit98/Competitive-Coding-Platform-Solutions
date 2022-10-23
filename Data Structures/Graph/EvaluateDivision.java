// PROBLEM STATEMENT LINK: https://leetcode.com/problems/evaluate-division/

class Solution {
    class Node {
        String key;
        double val;
        public Node(String k,double v) {
            key = k;
            val = v;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,List<Node>> g = buildGraph(equations,values);
        double res[] = new double[queries.size()];
        for(int i = 0;i < queries.size();i++) {
            res[i] = dfs(queries.get(i).get(0),queries.get(i).get(1),new HashSet<>(),g);
        }
        return res;
    }
    public double dfs(String s,String d,Set<String> visited,Map<String,List<Node>> g) {
        if(!(g.containsKey(s) && g.containsKey(d))) {
            return -1.0;
        }
        if(s.equals(d)) {
            return 1.0;
        }
        visited.add(s);
        for(Node it : g.get(s)) {
            if(!visited.contains(it.key)) {
                double ans = dfs(it.key,d,visited,g);
                if(ans != -1.0) 
                    return ans * it.val;
            }
        }
        return -1.0;
    }
    private Map<String,List<Node>> buildGraph(List<List<String>> eq,double values[]) {
        Map<String,List<Node>> g = new HashMap<>();
        for(int i = 0;i < values.length;i++) {
            String src = eq.get(i).get(0);
            String dst = eq.get(i).get(1);
            g.putIfAbsent(src,new ArrayList<>());
            g.putIfAbsent(dst,new ArrayList<>());
            g.get(src).add(new Node(dst,values[i]));
            g.get(dst).add(new Node(src,1/values[i]));
        }
        return g;
    }
}
