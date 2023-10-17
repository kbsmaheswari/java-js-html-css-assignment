import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Creates a random number generator
        Random random = new Random();

        // Performing Fisher-Yates shuffle
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swaping array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Printing the shuffled array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
