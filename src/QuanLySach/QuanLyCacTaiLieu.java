package QuanLySach;

public class QuanLyCacTaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public QuanLyCacTaiLieu(){}

    public QuanLyCacTaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {return maTaiLieu;}
    public void setMaTaiLieu(String maTaiLieu) {this.maTaiLieu = maTaiLieu;}

    public String getTenNhaXuatBan() {return tenNhaXuatBan;}
    public void setTenNhaXuatBan(String tenNhaXuatBan) {this.tenNhaXuatBan = tenNhaXuatBan;}

    public int getSoBanPhatHanh() {return soBanPhatHanh;}
    public void setSoBanPhatHanh(int soBanPhatHanh) {this.soBanPhatHanh = soBanPhatHanh;}


    @Override
    public String toString() {
        return "QuanLyCacTaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soBanPhatHanh='" + soBanPhatHanh + '\'' +
                '}';
    }
}
