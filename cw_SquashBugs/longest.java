package cw_SquashBugs;

public class longest {

    public static void main(String[] args)
    {
        /*assertEquals(7, findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, Kata.findLongest("Take me to tinseltown with you")); 
        assertEquals(7, Kata.findLongest("Sausage chops")); 
        assertEquals(6, Kata.findLongest("Wind your body and wiggle your belly")); 
        assertEquals(7, Kata.findLongest("Lets all go on holiday")); */
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