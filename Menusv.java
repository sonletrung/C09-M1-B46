import java.util.Scanner;
public class Menusv {
    public static void main(String[] args) {
        ungdung dssv = new ungdung();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------Menu----------------------");
            System.out.println("|  1. Hiển thị danh sách                 |");
            System.out.println("|  2. Sửa danh sách                      |");
            System.out.println("|  3. Xóa danh sách                      |");
            System.out.println("|  4. Thêm danh sách                     |");
            System.out.println("|  5. hiển thị danh sách điểm trung bình |");
            System.out.println("|  6. hiển thị danh sách học sinh giỏi   |");
            System.out.println("|  7. Hiện trạng thái của học sinh       |");
            System.out.println("------------------------------------------");
             choice = input.nextInt();
            switch (choice) {
                case 1:
                    dssv.hiendanhsach();
                    break;
                case 2:
                    dssv.suadanhsach();
                    break;
                case 3:
                    dssv.xoadanhsach();
                    break;
                case 5:
                    dssv.diemtrungbinh();
                    break;
                case 4:
                    dssv.themdanhsach();
                    break;
                case 6:
                    dssv.hocsinhgioi();
                    break;
                case 7:
                    dssv.trangthaihocsinh();
                    break;
                default:
                    break;
            }
        } while (choice!=0);
    }

}
