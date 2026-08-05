import java.util.List;

public class ParallelRace {

    public static int findMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).orElse(0);
    }

    public static int findMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).orElse(0);
    }

    public static long countElements(List<Integer> numbers) {
        return numbers.stream().count();
    }

    public static Result combinada(List<Integer> numbers) {
        int max = findMax(numbers);
        int min = findMin(numbers);
        long count = countElements(numbers);
        String multipleCheck = (max % 2 == 0) ? "Multiple of 2" : "Not a multiple of 2";
        String oddCheck = (count % 2 != 0) ? "Size is Odd" : "Size is Even";
        System.out.println("Max check: " + multipleCheck);
        System.out.println("List size check: " + oddCheck);
        return new Result(max, min, count);
    }

    public static void main(String[] args) {
        List<Integer> sample = List.of(5, 12, 3, 20, 8);
        System.out.println("Max value: " + findMax(sample));
        System.out.println("Min value: " + findMin(sample));
        System.out.println("Total elements: " + countElements(sample));
        Result res = combinada(sample);
    }
}
