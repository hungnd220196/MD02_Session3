import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int elementToDelete = scanner.nextInt();

        // Tìm vị trí của phần tử cần xoá
        int indexDel = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elementToDelete) {
                indexDel = i;
                break;
            }
        }

        if (indexDel != -1) {
            // Xoá phần tử và ghi đè
            for (int i = indexDel; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // Giảm kích thước của mảng
            n--;

            // Hiển thị mảng sau khi xoá
            System.out.println("Mảng sau khi xoá:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Phần tử không tồn tại trong mảng.");
        }
    }
}
