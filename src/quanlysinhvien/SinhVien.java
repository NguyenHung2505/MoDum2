package quanlysinhvien;

public  class SinhVien {
    private String id;
    private String ten;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String id, String ten, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getTen() {return ten;}
    public void setTen(String ten) {this.ten = ten;}

    public int getTuoi() {return tuoi;}
    public void setTuoi(int tuoi) {this.tuoi = tuoi;}

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
