import java.util.List;

public class ParallelRace {

    public static int findMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).orElse(0);
    }

    public static long countElements(List<Integer> numbers) {
        return numbers.stream().count();
    }

    public static void main(String[] args) {
        List<Integer> sample = List.of(5, 12, 3, 20, 8);
        System.out.println("Min value: " + findMin(sample));
        System.out.println("Total elements: " + countElements(sample));
    }
}
