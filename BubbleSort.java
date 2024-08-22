
public class BubbleSort {

    public static void bubbleSort(int[] larik) {
        int temp;
        int size = larik.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - (i + 1); j++) {
                if (larik[j] > larik[j + 1]) {
                    temp = larik[j];
                    larik[j] = larik[j + 1];
                    larik[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] larik = {3, 2, 4, 24, 12, 99, 23};

        System.out.print("Larik awal : ");
        for (int i : larik) {
            System.out.print(i + ", ");
        }

        System.out.println("");
        
        bubbleSort(larik);

        System.out.print("Larik setelah sorting : ");
        for (int i : larik) {
            System.out.print(i + ", ");
        }
    }
}
