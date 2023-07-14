public class App {
    public static void main(String[] args) {

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 50));
            System.out.print(array[i] + " ");
        }
        System.out.println();

        heapSort.sort(array);
       
        for (int j = 0; j < array.length; j++) {
        System.out.print(array[j] + " ");    
        }
    }
}
