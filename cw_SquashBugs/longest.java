package cw_SquashBugs;

public class longest {

    public static void main(String[] args)
    {
        int z = findLongest("The quick white fox jumped around the massive dog");
    }

    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
      return longest;
    }
}
