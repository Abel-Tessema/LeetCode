import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 3, 3};
        int number = majorityElement(numbers);
        System.out.println(number);
    }
    public static int majorityElement(int[] numbers) {
        if (numbers.length == 0)
            return Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            var count = map.getOrDefault(number, 0);
            map.put(number, ++count);
        }
        int majorityElement = numbers[0];
        for (int number : numbers)
            if (map.get(number) >= numbers.length / 2)
                majorityElement = number;

        return majorityElement;
    }
}