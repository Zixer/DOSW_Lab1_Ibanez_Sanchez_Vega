import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TreasureMap {

    public static HashMap<String, Integer> createHashMap(List<Map.Entry<String, Integer>> entries) {
        return entries.stream().collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue(),(firstValue, duplicateValue) -> firstValue,HashMap::new
        ));
    }

    public static Hashtable<String, Integer> createHashtable(List<Map.Entry<String, Integer>> entries) {
        return entries.stream().collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue(),(firstValue, duplicateValue) -> firstValue,Hashtable::new
        ));
    }

    public static Map<String, Integer> combineMaps(HashMap<String, Integer> hashMap,Hashtable<String, Integer> hashtable) {
        return Stream.concat(hashMap.entrySet().stream(), hashtable.entrySet().stream()).map(entry -> Map.entry(entry.getKey().toUpperCase(),entry.getValue())).sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue(),(hashMapValue, hashtableValue) -> hashtableValue,LinkedHashMap::new
        ));
    }

    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> hashMapEntries = List.of(
                Map.entry("gold", 5),
                Map.entry("silver", 3),
                Map.entry("gold", 7),
                Map.entry("diamond", 10)
        );
        List<Map.Entry<String, Integer>> hashtableEntries = List.of(
                Map.entry("silver", 8),
                Map.entry("ruby", 4),
                Map.entry("gold", 12),
                Map.entry("emerald", 6)
        );
        HashMap<String, Integer> hashMap =
                createHashMap(hashMapEntries);
        Hashtable<String, Integer> hashtable =
                createHashtable(hashtableEntries);
        Map<String, Integer> finalMap =
                combineMaps(hashMap, hashtable);
        finalMap.forEach((key, value) ->
                System.out.println("Key: " + key + " | Value: " + value)
        );
    }
}