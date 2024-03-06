import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int[] mang1 = new int[3];
        int[] mang2 = new int[4];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng 1
        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < mang1.length; i++) {
            System.out.print("Mang 1[" + i + "]: ");
            mang1[i] = scanner.nextInt();
        }

        // Bước 3: Nhập giá trị cho các phần tử trong mảng 2
        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < mang2.length; i++) {
            System.out.print("Mang 2[" + i + "]: ");
            mang2[i] = scanner.nextInt();
        }

        // Bước 4: Tạo mảng thứ 3 có kích thước bằng tổng kích thước mảng 1 và mảng 2
        int[] mang3 = new int[mang1.length + mang2.length];

        // Bước 5: Gán các phần tử của mảng 1 vào mảng 3
        for (int i = 0; i < mang1.length; i++) {
            mang3[i] = mang1[i];
        }

        // Bước 6: Gán các phần tử của mảng 2 vào mảng 3, tính từ phần tử đầu tiên của mảng 3
        for (int i = 0; i < mang2.length; i++) {
            mang3[mang1.length + i] = mang2[i];
        }

        // In mảng kết quả
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < mang3.length; i++) {
            System.out.print(mang3[i] + " ");
        }

    }
}


