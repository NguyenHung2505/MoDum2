package CanBo;

public class CongNhan extends CanBo {
    private String capBac;

    public CongNhan(String capBac) {
        this.capBac = capBac;
    }

    public CongNhan() {
    }

    public CongNhan(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String capBac) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CongNhan{" +
                "capBac='" + capBac + '\'' +
                '}';
    }
}
