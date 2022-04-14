package QLX;

public class Phuongtien {
    private String Hang;
    private String Mau;
    private String Ten;
    private int Gia;

    public Phuongtien() {
    }

    public Phuongtien(String hang, String mau, String ten, int gia) {
        Hang = hang;
        Mau = mau;
        Ten = ten;
        Gia = gia;
    }

    public String getHang() {return Hang;}
    public void setHang(String hang) {Hang = hang;}

    public String getMau() {return Mau;}
    public void setMau(String mau) {Mau = mau;}

    public String getTen() {return Ten;}

    public void setTen(String ten) {Ten = ten;}

    public int getGia() {return Gia;}
    public void setGia(int gia) {Gia = gia;}

    @Override
    public String toString() {
        return "Phuongtien{" +
                "Hang='" + Hang + '\'' +
                ", Mau='" + Mau + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}
