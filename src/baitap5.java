import java.util.Arrays;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("phần tử nhỏ nhất là " + min);
    }
}
