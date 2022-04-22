package QuanLySach;

public class Bao extends QuanLyCacTaiLieu{
    private float ngayPhatHanh;

    public Bao() {}

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, float ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public float getNgayPhatHanh() {return ngayPhatHanh;}
    public void setNgayPhatHanh(float ngayPhatHanh) {this.ngayPhatHanh = ngayPhatHanh;}

    @Override
    public String toString() {
        return super.toString()+
                "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
