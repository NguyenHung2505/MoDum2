package ThuNamNgayMuoiBon;

public class SinhVien extends Nguoi {
    private int diem;

    public SinhVien (){}

    public SinhVien(String id, String ten, String tuoi, int diem) {
        super(id, ten, tuoi);
        this.diem = diem;
    }


    public int getDiem() {return diem;}
    public void setDiem(int diem) {diem = diem;}

    @Override
    public String toString() {
        return  super.toString()+
                "SinhVien{" +
                "Diem=" + diem +
                '}';
    }
}
