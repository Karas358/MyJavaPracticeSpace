package prince_UFWeightedPCQU;

public class WeightedPathComp {
    private int[] id;
    private int[] idSize;
    public void init(int num){
        id = new int[num];
        idSize = new int[num];
        for(int x = 0; x < num;x++) 
        {    
            id[x] = x; 
            idSize[x] = 1;
        }
    }
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }
    public void union(int p, int q){
        int rootP = root(p);
        int rootQ = root(q);
        if(rootP == rootQ) return;
        if(idSize[rootP] < idSize[rootQ]){
            id[rootP] = rootQ;
            idSize[rootQ] += idSize[rootP];
        }else{
            id[rootQ] = rootP;
            idSize[rootP] += idSize[rootQ];
        }
    }
    public int root(int s){
        while(id[s] != s) 
        {
            id[s] = id[id[s]];
            s = id[s];
        }
        return s;
    }
}
