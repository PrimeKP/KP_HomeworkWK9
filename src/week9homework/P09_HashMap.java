package week9homework;

import java.util.*;
/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class P09_HashMap {
    public static void main(String[] args) {
        P09_HashMap obj = new P09_HashMap();
        obj.person();
    }

    public void person() {
        Map<String, Integer> persons = new HashMap<String, Integer>();
        persons.put("Andy ", 30);
        persons.put("Brian ", 25);
        persons.put("Charlie", 35);
        persons.put("Dan", 42);


       /* for (String i : persons.keySet()) {
            System.out.println(" Name = " + i + "  " + persons);
*/
           /* for(Map.Entry<String, Integer> set : persons.entrySet()){

                System.out.println(set.getKey() + " = " + set.getValue());
*/
        for (Map.Entry<String, Integer> entry : persons.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
        }

    }
}







