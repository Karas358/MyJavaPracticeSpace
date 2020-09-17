package leet_Impplement_strStr;

public class NeedleHayStack {

    public static void main(String[] args){
        //int is = strStr("hello", "ll");
        //int is = strStr("hello", "zz");
        //int is = strStr("aaaaa", "bba");
    }

    public static int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        int needleCur = 0;

        if(needle.isEmpty()) return 0;
        if(haystack.isEmpty()) return -1;
        if(needleLen > haystackLen) return -1;
        needleCur = needleLen;
        int loopLim = (haystackLen - needleLen) + 1;
        for(int x = 0; x < loopLim; x++){
            String hayNow = haystack.substring(x, (needleCur));
            if(needle.equals(hayNow)) return x;
            needleCur++;
        }
        return -1;
    }

    /*
    77 / 77 test cases passed.
    Status: Accepted
    Runtime: 0 ms
    Memory Usage: 39.8 MB
    */

    /*public static int strStr(String haystack, String needle) {
    int needleLen = needle.length();
        int haystackLen = haystack.length();
        int needleCur = 0;

        if(needle.isEmpty()) return 0;
        if(haystack.isEmpty()) return -1;
        if(needleLen > haystackLen) return -1;
        needleCur = needleLen;
        int loopLim = (haystackLen - needleLen) + 1;
        for(int x = 0; x < loopLim; x++){
            String hayNow = haystack.substring(x, (needleCur));
            if(needle.equals(hayNow)) return x;
            needleCur++;
        }
        return -1;
    } */

}
