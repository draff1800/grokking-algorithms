import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        // Customise originalArray to experiment with Selection Sort.
        ArrayList<Integer> originalArray = new ArrayList<>(Arrays.asList(10, 2, 7, 4, 5));
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();

        System.out.println("Original array was: " + originalArray);

        for(int i = 0; i < originalArray.size();) {
            int indexOfSmallestElement = getIndexOfSmallestElement(originalArray);
            sortedArray.add(originalArray.get(indexOfSmallestElement));
            originalArray.remove(indexOfSmallestElement);
        }

        System.out.println("Sorted array is: " + sortedArray);
    }

    public static int getIndexOfSmallestElement(ArrayList<Integer> array) {
        int smallest = array.get(0);
        int indexOfSmallest = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < smallest) {
                smallest = array.get(i);
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }
}
