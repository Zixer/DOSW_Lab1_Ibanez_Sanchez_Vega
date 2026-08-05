import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TreasureMap {

    public static HashMap<String, Integer> createTreasureMap(
            List<Map.Entry<String, Integer>> entries) {

        return entries.stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue(),
                        (firstValue, duplicateValue) -> firstValue,
                        HashMap::new
                ));
    }
}