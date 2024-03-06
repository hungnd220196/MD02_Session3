public class demo1 {
    public static void main(String[] args) {
        //khai báo mảng
        int[] numbers = new int[5];
        System.out.println(numbers.length);
        String[] nyc = {"T","H","U"};
        System.out.println(nyc.length);
        // truy cập vào phần tử của mảng
        System.out.println("người yc thứu 3 là " + nyc[2]);

        // dùng vòng lặp để duyệt qua mảng
        System.out.println("danh sách nyc ");
        for (int i = 0; i < nyc.length; i++) {
            System.out.println(nyc[i]);
        }
        //
        for (String item : nyc){
            System.out.println(item);
        }
    }
}
