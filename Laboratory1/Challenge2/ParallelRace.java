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

    public static Result ambasListas(List<Integer> list1, List<Integer> list2) {
        int max1 = findMax(list1);
        int min1 = findMin(list1);
        long count1 = countElements(list1);
        
        int max2 = findMax(list2);
        int min2 = findMin(list2);
        long count2 = countElements(list2);

        String check1 = (max1 % 2 == 0) ? "Multiple/Divisor of 2" : "Not multiple/divisor of 2";
        String sizeCheck1 = (count1 % 2 != 0) ? "Odd size" : "Even size";

        System.out.println("Max: " + max1 + ", Min: " + min1 + ", Count: " + count1 + " | " + check1 + " | " + sizeCheck1);
        System.out.println("Max 2: " + max2 + ", Min 2: " + min2 + ", Count 2: " + count2);

        return new Result(max1, min1, count1);
    }

    public static void main(String[] args) {
        List<Integer> sample1 = List.of(5, 12, 3, 20, 8);
        List<Integer> sample2 = List.of(2, 7, 14, 9);
        
        processBothLists(sample1, sample2);
    }
}
