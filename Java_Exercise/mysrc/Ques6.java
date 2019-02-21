package Exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ques6 {
    


    public static void main(String[] args){
        int[] arr= new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4};
       int c=arr.length;
        Arrays.sort(arr);

        Map<String, Integer> counts = new HashMap<String,Integer>();

        String key;
        for ( int i : arr ) {
            key = String.valueOf( i );
            if ( counts.containsKey( key ) ) {
                int count = counts.get( key );
                counts.put( key, ++count );
            }
            else {
                counts.put( key, 1 );
            }
        }

        for ( Map.Entry<String, Integer> entry : counts.entrySet() ) {
            if ( entry.getValue() < 2 ) {
                System.out.println( entry.getKey() + " does not have a pair" );
            }
        }


    }
}
