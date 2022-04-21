package ThuNamNgayMuoiBon;

public abstract class Nguoi {
    private String id;
    private String Ten;
    private String Tuoi;

    public Nguoi() {
    }

    public Nguoi(String id, String ten, String tuoi) {
        this.id = id;
        this.Ten = ten;
        this.Tuoi = tuoi;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getTen() {return Ten;}
    public void setTen(String ten) {Ten = ten;}

    public String getTuoi() {return Tuoi;}
    public void setTuoi(String tuoi) {Tuoi = tuoi;}

    @Override
    public String toString() {
        return "LopNguoi{" +
                "id='" + id + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Tuoi='" + Tuoi + '\'' +
                '}';
    }

//    public abstract String compareTo(SinhVien1 Kh);
}
