
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            
            MainProgram.swap(array, index, MainProgram.indexOfSmallestFrom(array, index));
            
            index++;
        }

    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int num1 = array[index1];

        array[index1] = array[index2];
        array[index2] = num1;

    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your code here
        int smallest = array[startIndex];
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallest = array[0];
        int index = 0;
        int indexOfSmallest = 0;

        for (int item : array) {
            if (item < smallest) {
                smallest = item;
                indexOfSmallest = index;
            }
            index++;
        }
        return indexOfSmallest;
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int item : array) {
            if (item < smallest) {
                smallest = item;
            }
        }
        return smallest;
    }
}
