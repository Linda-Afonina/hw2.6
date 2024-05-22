import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);

        System.out.println("Задача 2.");
        printEvenNumbers(nums);

        System.out.println("Задача 3.");
        List<String> strings3 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре", "четыре"));
        printUniqueWords(strings3);

        System.out.println("Задача 4.");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printNumberOfDuplicates(strings);
    }

    public static void printOddNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumbers(List<Integer> nums) {
        List<Integer> uniqueEvenNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !uniqueEvenNums.contains(nums.get(i))) {
                uniqueEvenNums.add(nums.get(i));
            }
        }
        Collections.sort(uniqueEvenNums);
        System.out.println(uniqueEvenNums);
    }

    public static void printUniqueWords(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (!uniqueWords.contains(words.get(i))) {
                uniqueWords.add(words.get(i));
            }
        }
        System.out.println(uniqueWords);
    }

    public static void printNumberOfDuplicates(List<String> words) {
        Map<String, Integer> numberOfDuplicates = new HashMap<>();
        for (String word : words) {
            if (!numberOfDuplicates.containsKey(word)) {
                numberOfDuplicates.put(word, 1);
            } else numberOfDuplicates.put(word, numberOfDuplicates.get(word) + 1);
        }
        System.out.println(numberOfDuplicates.values());
    }
}