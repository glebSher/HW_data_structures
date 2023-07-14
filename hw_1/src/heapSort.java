public class heapSort {
    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapyfy(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapyfy(array, i, 0);
        }
    }

    public static void heapyfy(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int lestChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (lestChild < heapSize && array[lestChild] > array[largest])
            largest = lestChild;

        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapyfy(array, heapSize, largest);
        }
    }
}
