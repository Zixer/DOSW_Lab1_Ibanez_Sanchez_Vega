import java.util.List;

public class ParallelRace {
    
    public static int findMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).orElse(0);
    }

    public static Result combinada(List<Integer> numbers) {
        int max = findMax(numbers);
        String multipleCheck = (max % 2 == 0) ? "Multiple of 2" : "Not a multiple of 2";
        return new Result(max, 0, 0);
    }

    public static void main(String[] args) {
        List<Integer> sample = List.of(5, 12, 3, 20, 8);
        System.out.println("Max value: " + findMax(sample));
    }
}
