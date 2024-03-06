import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số phần tử của mảng");
        int n = scanner.nextInt();
        int[] array = new int[n];
        // Hiển thị mảng và chỉ số
        System.out.print("Dòng value: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Dòng index: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Nhập giá trị mới và vị trí cần chèn từ người dùng
        System.out.print("Nhập giá trị mới: ");
        int newValue = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (từ 0 đến 9): ");
        int index = scanner.nextInt();

        // Kiểm tra xem vị trí nhập vào có hợp lệ không
        if (index < 0 || index >= array.length) {
            System.out.println("Vị trí không hợp lệ.");
            return;
        }

        // Dịch phần tử sang phải để tạo chỗ trống cho giá trị mới
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        // Chèn giá trị mới vào vị trí chỉ định
        array[index] = newValue;

        // Hiển thị mảng sau khi chèn giá trị mới
        System.out.print("Dòng new value: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
