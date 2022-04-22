package BoMayQuanLy;

public class Nguoi {
    private String tenN,tinhDc;
    private int maN,tuoiN;
    private static int autoId = 0;

    public Nguoi() {}

    public Nguoi(String tenN, String tinhDc, int maN, int tuoiN) {
        this.maN = autoId;
        autoId++;
        this.tenN = tenN;
        this.tinhDc = tinhDc;
        this.maN = maN;
        this.tuoiN = tuoiN;
    }

    public String getTenN() {
        return tenN;
    }

    public void setTenN(String tenN) {
        this.tenN = tenN;
    }

    public String getTinhDc() {
        return tinhDc;
    }

    public void setTinhDc(String tinhDc) {
        this.tinhDc = tinhDc;
    }

    public int getMaN() {
        return maN;
    }

    public void setMaN(int maN) {
        this.maN = maN;
    }

    public int getTuoiN() {
        return tuoiN;
    }

    public void setTuoiN(int tuoiN) {
        this.tuoiN = tuoiN;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "tenN='" + tenN + '\'' +
                ", tinhDc='" + tinhDc + '\'' +
                ", maN=" + maN +
                ", tuoiN=" + tuoiN +
                '}';
    }
}
