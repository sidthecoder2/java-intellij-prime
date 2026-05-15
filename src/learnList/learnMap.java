package learnList;

import java.util.*;

public class learnMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("en", "English");
        map.put("hin", "Hindi");
        map.put("mh", "Marathi");
        map.put("pu", "Punjabi");

        //also if we e=want to traverse in Map --in both key and value we can do using entry set

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        //you can traverse in keys if you want to in the set
        ArrayList<String> keys = new ArrayList<>(map.keySet()); //cause this returns set and that can be typecasted

        //this will return collection then you can traverse in values
        Collection<String> values = map.values();
        System.out.println(values);

        map.remove("pu");
        map.remove("pu", "Kannada");  //we can use any one of the two methods to remove

        System.out.println(map.containsKey("mh"));
        System.out.println("Contains value : "+ map.containsValue("Hindi"));



        System.out.println(map);
    }
}
