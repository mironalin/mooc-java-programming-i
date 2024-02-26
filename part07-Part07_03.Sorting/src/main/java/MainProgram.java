import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        
        for (int i = 0 ; i < array.length; i++) {
            int indexSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of the smallest number: " + indexOfSmallest(array));
        System.out.println("Index of the smallest number starting from index 2: " + indexOfSmallestFrom(array, 2));
        
        //swap(array, 0, 5);
        //System.out.println(Arrays.toString(array));

        sort(array);
    }

}
