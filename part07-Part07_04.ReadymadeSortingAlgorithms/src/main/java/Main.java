import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers.toString());
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings.toString());
    }
    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

}
