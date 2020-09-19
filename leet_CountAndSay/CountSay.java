package leet_CountAndSay;

public class CountSay {

    /**
     * Developer - Mfundo Falteni
     * @param {int} n
     * @return {string}
    */
    public static void main(String[] args){
        String se = countAndSay(2);
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
                
                if(count > 0) res.append(count + String.valueOf(charSeq[y]));
                if(charSeq[y] < 0)  res.append(String.valueOf(count));
                if(count < 0) res.append(String.valueOf(charSeq[y]));
            }
            
        }
        return res.toString();
    }
}
