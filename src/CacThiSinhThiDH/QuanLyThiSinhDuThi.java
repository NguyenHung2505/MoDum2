package CacThiSinhThiDH;

public class QuanLyThiSinhDuThi {
    private int soBaoDanh;
    private String hoVaTen;
    private String diaChi;
    private int mucUuTien;

    public QuanLyThiSinhDuThi() {
    }

    public QuanLyThiSinhDuThi(int soBaoDanh, String hoVaTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return "QuanLyThongTin{" +
                "soBaoDanh=" + soBaoDanh +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
