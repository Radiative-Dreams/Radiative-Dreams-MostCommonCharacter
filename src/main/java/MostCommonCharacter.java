import java.util.HashMap;
import java.util.Map;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> vals = new HashMap<>();
        for( int i = 0; i < str.length(); i++)
        {
            if( vals.get(str.charAt(i)) == null ) vals.put(str.charAt(i), 1);
            else
            {
                vals.put(  str.charAt(i), vals.get( str.charAt(i) )+1  );
            }
        }
        //System.out.println(vals + "\n");
        int max = 0;
        char x = ' ';
        for (Map.Entry<Character, Integer> it : vals.entrySet() ) {
            if(max < it.getValue()) 
            {
                max = it.getValue();
                x = it.getKey();
            }
        }
        return x;
    }
}
