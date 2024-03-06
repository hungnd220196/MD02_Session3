import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        float[] diems = new float[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập điểm Toán");
        diems[0] = scanner.nextFloat();
        System.out.println("mời bạn nhập điểm Lý");
        diems[1] = scanner.nextFloat();
        System.out.println("mời bạn nhập điểm Hóa");
        diems[2] = scanner.nextFloat();
        float sum = 0;
        for (int i = 0; i < diems.length; i++) {
            sum+= diems[i];
        }
        System.out.printf("điểm trung bình là %.2f ",(sum/diems.length));
    }
}
