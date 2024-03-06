public class baitap4 {
    public static void main(String[] args) {
        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int max = arr[0][0]; // Giả sử phần tử đầu tiên là lớn nhất
        int row = 0;
        int col = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất của ma trận là " + max + " tại vị trí [" + row + ", " + col + "]");
    }
}
