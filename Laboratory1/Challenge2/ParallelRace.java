import java.util.List;

public class ParallelRace {

    // Lane One: Retorna el número más grande usando Streams/Lambdas
    public static int findMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> sample = List.of(5, 12, 3, 20, 8);
        System.out.println("Max value: " + findMax(sample));
    }
}
