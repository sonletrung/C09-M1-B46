import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ungdung {
    private ArrayList<SVGV>danhsach;
    public ungdung(){
        this.danhsach = new ArrayList<>();
        this.danhsach.add(new SVGV(1,"nguyên văn A",6.7,7.0,8.5));
        this.danhsach.add(new SVGV(2,"nguyên văn B",9.3,4.5,6.5));
    }
    public void hiendanhsach(){
        for(int i=0;i<this.danhsach.size();i++){
            System.out.println("Danh sách đang chứa "+this.danhsach.get(i).toString());
            }
    }
    public void suadanhsach(){
        System.out.println("Nhập vào MSSV cần sửa");
        Scanner input = new Scanner(System.in);
        int mssv = input.nextInt();
        boolean found =false;
        for (SVGV svgv : danhsach) {
            if (svgv.getMSSV() == mssv) { 
                System.out.println("Student found: " + svgv.toString());
                found = true;

                System.out.println("Nhập thông tin sinh viên mới:");
                input.nextLine();
                System.out.print("Tên: ");
                svgv.setName(input.nextLine());

                System.out.print("Điểm toán: ");
                svgv.setDiemtoan(input.nextDouble());
                System.out.print("Điểm Lý: ");
                svgv.setDiemly(input.nextDouble());
                System.out.print("Điểm Hóa: ");
                svgv.setDiemhoa(input.nextDouble());

                System.out.println("Thông tin sinh viên sau khi sửa: " + svgv.toString());
                break; 
            }
        }
    }
    public void xoadanhsach(){
        System.out.println("Nhập vào MSSV cần xóa");
        Scanner input = new Scanner(System.in);
        int mssv = input.nextInt();
        this.danhsach.remove(mssv);
        hiendanhsach();

    }
    public void diemtrungbinh(){
        for (SVGV svgv : danhsach) {
            double diemtrungbinh = (svgv.getDiemhoa()+svgv.getDiemly()+svgv.getDiemtoan())/3;
            System.out.println("Tên Sinh viên: "+ svgv.getName()+"Điểm TB là : "+diemtrungbinh);
        }
    }
    public void themdanhsach(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào MSSV: ");
        int Id = input.nextInt();
        System.out.println("Nhập vào tên: ");
        String name = input.nextLine();
        System.out.println("Nhập vào điểm Toán: ");
        double d1= input.nextDouble();
        System.out.println("Nhập vào điểm Lý: ");
        double d2= input.nextDouble();
        System.out.println("Nhập vào điểm hóa: ");
        double d3= input.nextDouble();
        SVGV svgv = new SVGV(Id,name,d1,d2,d3);
        this.danhsach.add(svgv);
        hiendanhsach();
    }
    public void hocsinhgioi(){
        boolean four = false;
        for (SVGV svgv : danhsach) {
            double diemtrungbinh = (svgv.getDiemhoa()+svgv.getDiemly()+svgv.getDiemtoan())/3;
            if (diemtrungbinh>8.5 && svgv.getDiemhoa()>8&&svgv.getDiemly()>8&&svgv.getDiemtoan()>8) {
                System.out.println("Tên Sinh viên: "+ svgv.getName()+"Điểm TB là : "+diemtrungbinh);
                four =true;
            }
        }
        if (!four) {
            System.out.println("Không có Sinh viên nào thỏa mãn"); 
        }

    }

    public void trangthaihocsinh(){
            for (SVGV svgv : danhsach) {
            double diemtrungbinh = (svgv.getDiemhoa()+svgv.getDiemly()+svgv.getDiemtoan())/3;
            if (diemtrungbinh<5 && svgv.getDiemhoa()<5&&svgv.getDiemly()<5&&svgv.getDiemtoan()<5) {
                System.out.println("Tên Sinh viên: "+ svgv.getName()+"Trang thái Trượt!");
            }
            else if(diemtrungbinh>=5 && svgv.getDiemhoa()>5&&svgv.getDiemly()>5&&svgv.getDiemtoan()>5){
                System.out.println("Tên Sinh viên: "+ svgv.getName()+"  Lên lớp");
            }
        }

    }
}
