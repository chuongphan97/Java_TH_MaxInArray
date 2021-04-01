import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Input size: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

        for (int i = 0;i < size;i++){
            System.out.print("array["+i+"]= ");
            array[i] = scanner.nextInt();

        }
        System.out.println("Giá trị lớn nhất của mảng là: "+ maxOfArray(array));
    }
    public static int maxOfArray(int[] arr){
        int max = arr[0];
        for (int i : arr
             ) {
            if (max < i) max = i;

        }
        return max;
    }

}
