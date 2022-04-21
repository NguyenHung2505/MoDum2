package ConNguoi;

public class Hito {
    private String ten;
    private int tuoi;
    private String cv;
    private int cmnd;

    public Hito() {}

    public Hito(String ten, int tuoi, String cv, int cmnd) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.cv = cv;
        this.cmnd = cmnd;
    }

    public String getTen() {return ten;}
    public void setTen(String ten) {
        this.ten = ten;}

    public int getTuoi() {return tuoi;}
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;}

    public String getCv() {return cv;}
    public void setCv(String cv) {
        this.cv = cv;}

    public int getCmnd() {return cmnd;}
    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;}


    @Override
    public String toString() {
        return "Hito{" + "Ten='" + ten + '\'' + ", Tuoi=" + tuoi +
                ", Cv='" + cv + '\'' + ", Cmnd=" + cmnd + '}';
    }
}
