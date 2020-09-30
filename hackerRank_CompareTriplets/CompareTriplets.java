package hackerRank_CompareTriplets;

import java.util.*;

    
    public class CompareTriplets {
    public static void main(String[] args) {

    }

    public List<Integer> compareTriplets(List<Integer> a,List<Integer> b){
        int aScore = 0;
        int bScore = 0;
        int lenA = a.size();
        int lenB = b.size();
        List<Integer> returnList = new ArrayList<>();
        if(lenA != lenB) return null;
        for(int x = 0; x < lenA;x++){
            if(a.get(x) > b.get(x)) aScore++;
            if(b.get(x) > a.get(x)) bScore++;
        }
        returnList.add(aScore);
        returnList.add(bScore);
        return returnList;
    }
}
