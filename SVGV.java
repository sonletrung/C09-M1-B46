
public class SVGV {
    private int MSSV;
    private String name;
    private double diemtoan;
    private double diemly;
    private double diemhoa;
    public SVGV(int mSSV, String name, double diemtoan, double diemly, double diemhoa) {
        MSSV = mSSV;
        this.name = name;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
    }
    public int getMSSV() {
        return MSSV;
    }
    public void setMSSV(int mSSV) {
        MSSV = mSSV;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDiemtoan() {
        return diemtoan;
    }
    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }
    public double getDiemly() {
        return diemly;
    }
    public void setDiemly(double diemly) {
        this.diemly = diemly;
    }
    public double getDiemhoa() {
        return diemhoa;
    }
    public void setDiemhoa(double diemhoa) {
        this.diemhoa = diemhoa;
    }
    @Override
    public String toString() {
        return "SVGV [MSSV=" + MSSV + ", name= " + name + "  \ndiemtoan=" + diemtoan + "  diemly=" + diemly + "  diemhoa="
                + diemhoa + "]";
    }
    
}