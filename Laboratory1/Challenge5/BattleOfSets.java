import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BattleOfSets {
    public static Set<Integer> processHashSet(Set<Integer> numbers) {
        return numbers.stream().filter(n -> n % 3 != 0).collect(Collectors.toCollection(HashSet::new));
    }
}