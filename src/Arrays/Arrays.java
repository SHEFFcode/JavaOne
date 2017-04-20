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

        ResizeArray(new int[] {1, 2}, 10);
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

    public double Average(int[] integerArray) {
        int sum = 0;
        for (int i = 0; i < integerArray.length; i++) {
            sum += integerArray[i];
        }

        return (double) sum / integerArray.length;
    }

    private void ResizeArray(int[] originalArray, int newSize) {
        int[] newArray = new int[newSize];

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        System.out.println("" + originalArray[0] + newArray[0]);

    }

    public static void printArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
