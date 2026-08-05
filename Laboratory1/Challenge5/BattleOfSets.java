import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BattleOfSets {
    public static Set<Integer> processTreeSet(Set<Integer> numbers) {
        return numbers.stream().filter(n -> n % 5 != 0).collect(Collectors.toCollection(TreeSet::new));
    }
}