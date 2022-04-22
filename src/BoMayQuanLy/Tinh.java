package BoMayQuanLy;

public class Tinh {
   private String tenT;
   private double gdp;
   private int maT;
   private static int dem = 0;

    public Tinh() {}

    public Tinh(String tenT, double gdp, int maT) {
        this.maT = dem;
        dem++;
        this.tenT = tenT;
        this.gdp = gdp;
        this.maT = maT;
    }

    public String getTenT() {
        return tenT;
    }

    public void setTenT(String tenT) {
        this.tenT = tenT;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public int getMaT() {
        return maT;
    }

    public void setMaT(int maT) {
        this.maT = maT;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "tenT='" + tenT + '\'' +
                ", gdp=" + gdp +
                ", maT=" + maT +
                '}';
    }
}
