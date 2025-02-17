import java.util.*;

public class SumCalculator {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> numbers = parseStringListToIntegerList(numberStrings);
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }

    // Method to parse a list of strings to a list of integers
    public static List<Integer> parseStringListToIntegerList(List<String> strList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : strList) {
            intList.add(Integer.parseInt(str)); // Autoboxing happens here
        }
        return intList;
    }

    // Method to calculate sum using unboxing
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing happens here
        }
        return sum;
    }
}