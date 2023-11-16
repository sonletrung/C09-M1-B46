public class Gv {
    private int id;
    private String name;
    private String monday;
    private double luong;
    public Gv(int id, String name, String monday, double luong) {
        this.id = id;
        this.name = name;
        this.monday = monday;
        this.luong = luong;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMonday() {
        return monday;
    }
    public void setMonday(String monday) {
        this.monday = monday;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    @Override
    public String toString() {
        return "Gv [id=" + id + ", name=" + name + ", monday=" + monday + ", luong=" + luong + "]";
    }
    
}
