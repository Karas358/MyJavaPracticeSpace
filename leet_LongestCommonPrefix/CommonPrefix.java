package leet_LongestCommonPrefix;

public class CommonPrefix {

    public static void main(String[] args){
        //String[] strings = {"flower","flow","flight"};
        //String[] strings = {"dog","racecar","car"};
        //String[] strings = {"c","c"};
        //String[] strings = {};
        //String[] strings = {""};
        String[] strings = {"aa","a"};
        
        String res = longestCommonPrefix(strings);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        int prefLen = 0;
        String pref = "";
        try{
            if(strs.length == 0) return strs[0];
            if(strs.length <= 1) return strs[0];
            for(int x = 0; x < strs[0].length();x++){
                prefLen++;
                if(strs[0].isBlank()) return strs[0]; 
                pref = strs[0].substring(0, prefLen);
                for(int y = 1; y < strs.length;y++){
                    if(!(prefLen > strs[y].length())){
                        String curr = strs[y].substring(0,prefLen);
                        if(!curr.equals(pref))  return pref.substring(0, (pref.length()-1));
                    }else{
                        return pref.substring(0, (pref.length()-1));
                    }
                }
            }
            return pref;
        }catch(Exception e){
            return "";
        }
    }
}
