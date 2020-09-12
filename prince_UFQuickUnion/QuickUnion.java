package prince_UFQuickUnion;

public class QuickUnion{
    private int[] id;
    public void init(int num){
        id = new int[num];
        for(int x = 0; x < num;x++) id[x] = x;
    }
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    public void union(int p, int q){
        id[root(p)] = id[root(q)];
    }
    public int root(int s){
        while(id[s] != s) s = id[s];
        return s;
    }
}
