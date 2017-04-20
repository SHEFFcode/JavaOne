package Arrays;

/**
 * Created by jeremy.shefer on 4/19/17.
 */
public class Arrays {
    public void Run() {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        printArray(myIntArray);
    }

    public void Run(int numberOfElements) {
        int[] intArray = new int[numberOfElements];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 5;
        }

        for (int Integer: intArray) {
            System.out.println(Integer);
        }
    }

    public static void printArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
