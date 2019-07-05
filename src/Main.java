import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mainArray = {1, 2, 3, 4};
        System.out.println("Array: \t\t\t\t" + Arrays.toString(mainArray));
        reverse(mainArray);
        System.out.println("Reversed array: \t" + Arrays.toString(mainArray));

    }

    private static void reverse(int[] array) {
        int halfLength = array.length / 2;
        int maxIndex = array.length - 1;

        for (int i = 0; i < halfLength; i++) {
            int buffer = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = buffer;
            maxIndex--;
        }
    }
}
