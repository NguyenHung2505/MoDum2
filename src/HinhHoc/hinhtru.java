package HinhHoc;

public class hinhtru extends hinhtron {
    private double h;

    public hinhtru() {
    }

    public hinhtru(double bankinh, String mausac, double h) {
        super(bankinh, mausac);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double tTich(){
        return super.dienTich()*h;
    }

    @Override
    public String toString() {
        return "hinhtru{" +super.toString()+
                "h='" + h + '\'' +
                '}';
    }


}
