package HinhHoc;

public class hinhtron {
    private double bankinh;
    private String mausac;

    public hinhtron() {}

    public hinhtron(double bankinh, String mausac) {
        this.bankinh = bankinh;
        this.mausac = mausac;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public double dienTich(){
        return Math.PI *bankinh *bankinh;
    }

    @Override
    public String toString() {
        return "hinhtron{" +
                "bankinh=" + bankinh +
                ", mausac=" + mausac +
                '}';
    }

}
