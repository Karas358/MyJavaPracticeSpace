package prince_UFQuickFind;

public class QuickFind{
     int[] id;
    public void init(int num){
        id = new int[num];
        for(int x = 0; x < num;x++){
            id[x] = x;
        }
    }
    public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }
    public void doUnion(int p, int q){
        for(int z = 0; z < id.length - 1;z ++){
            if(id[z] == id[p]){
                id[z] = id[q];
            }
        }
    }
}