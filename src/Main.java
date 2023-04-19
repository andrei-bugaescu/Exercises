import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(44);
        numbers.add(88);
        numbers.add(99);
        numbers.add(11);
        int n = numbers.size();

        for (int i = 0; i < n; i++) {   // outer loop starts from the first element to the last one
            for (int j = i + 1; j < n; j++) {  // inner loop starts from the next element after to the last one
                if (numbers.get(i) > numbers.get(j)) { // compare the element from index i and  index j
                    int temp = numbers.get(i);  // if element i is bigger than element j, will swaps using a temporary variable "temp"
                    numbers.set(i, numbers.get(j)); // replace element i with the element j
                    numbers.set(j, temp); // replace element j with the element variable "temp"
                }
            }
        }
            System.out.println(numbers);
    }
}