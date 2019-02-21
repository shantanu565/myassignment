package Exercise1;

import java.util.HashMap;
import java.util.Set;

public class Que2 {
    //Write a program to find the number of occurrences of the duplicate words in a string and print them
    public static void main(String[] args){

        String value = "This is dog cat dog cat";

        String item[] = value.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);

            } else {
                map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
