package leet_CountAndSay;

public class CountSay {

    /**
     * Developer - Mfundo Falteni
     * @param {int} n
     * @return {string}
    */
    public static void main(String[] args){
        String se = countSay(2);
    }

    public static String countAndSay(int n) {
        if(n > 30 || n < 0) return "";
        String seq = "1";
        int count = 0;
        StringBuilder res = new StringBuilder();
        
        for(int x = 0; x < n ; x++){
            if(n == 1) return seq;
            char[] charSeq = seq.toString().toCharArray();
            
            for(int y = 0; y < charSeq.length;y++){
                char c = charSeq[y];
                for(int z = y + 1; z < y - 1; z++){
                    if(c == charSeq[z]){
                        count += 1;
                    }
                }
                if(count > 0) res.append(count).append(String.valueOf(charSeq[y]));// + String.valueOf(charSeq[y]));
                if(charSeq[y] < 0)  res.append(String.valueOf(count));
                if(count < 0) res.append(String.valueOf(charSeq[y]));
            }
            
        }
        return res.toString();
    }

    public static String countSay(int n){
        if(n > 30 || n < 0) return "";
        String seq = "1";
        int count = 1;
        StringBuilder res = new StringBuilder();
        int currLeft = 0;

        char[] charSeq = null;
        while(currLeft < n){
            if(n == 1) return seq;
            charSeq = seq.toString().toCharArray();
            for(int x = 0; x < n - 1; x++){
                if(charSeq[currLeft] == charSeq[currLeft + 1]){
                    count++;
                    currLeft++;
                }
            }
            
            res.append(charSeq[currLeft] + "" + count);
        }
        return res.toString();
    }
}
