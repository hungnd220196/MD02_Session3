import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một mảng có sẵn
        double[][] matrix1 = {
                {1, 2, 3},
                {4.2, 5, 6.7},
                {7.8, 8, 9.2}
        };

        // Hiển thị ma trận cho người dùng
        System.out.println("Ma trận có sẵn:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int col1 = scanner.nextInt();

        double tongCot1 = 0;
        for (int i = 0; i < matrix1.length; i++) {
            tongCot1 += matrix1[i][col1];
        }
        System.out.println("Tổng các phần tử của cột " + col1 + " là: " + tongCot1);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] matrix2 = new double[rows][cols];
        System.out.println("Nhập giá trị cho các phần tử của mảng:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Mảng[" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int col2 = scanner.nextInt();

        double tongCot2 = 0;
        for (int i = 0; i < matrix2.length; i++) {
            tongCot2 += matrix2[i][col2];
        }
        System.out.println("Tổng các phần tử của cột " + col2 + " trong mảng của bạn là: " + tongCot2);
    }
}

