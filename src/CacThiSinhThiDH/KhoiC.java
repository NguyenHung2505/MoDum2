package CacThiSinhThiDH;

public class KhoiC extends QuanLyThiSinhDuThi {

    private static final String van = "van";
    private static final String su = "su";
    private static final String dia = "dia";

    public KhoiC() {}

    public KhoiC(int soBaoDanh, String hoVaTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoVaTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "KhoiC{}";
    }
}
