import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int result = numbers.stream()
//                .filter((n) -> n % 2 == 0) // 2, 4
//                .mapToInt(x -> x)
//                .sum();

//        System.out.println(result);
        int sum = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                sum += n;

            }

        }
        System.out.println(sum);
    }
}