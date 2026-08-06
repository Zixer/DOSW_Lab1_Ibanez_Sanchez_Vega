import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BattleOfSets {
    
    public static Set<Integer> processHashSet(Set<Integer> numbers) {
        return numbers.stream().filter(n -> n % 3 != 0).collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> processTreeSet(Set<Integer> numbers) {
        return numbers.stream().filter(n -> n % 5 != 0).collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        Set<Integer> hashInput = Set.of(4, 9, 15, 7, 18, 21, 10, 5);
        Set<Integer> treeInput = Set.of(12, 3, 25, 10, 7, 30, 18, 4);
        Set<Integer> hashSetArmy = processHashSet(hashInput);
        Set<Integer> treeSetArmy = processTreeSet(treeInput);
        Set<Integer> finalArena = new TreeSet<>();
        finalArena.addAll(hashSetArmy);
        finalArena.addAll(treeSetArmy);
        finalArena.forEach(number -> System.out.println("Number in the arena: " + number));
    }
}