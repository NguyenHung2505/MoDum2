package QLX;

public class XeMay extends Phuongtien{
    private int DungTich;

    public XeMay(){}

    public XeMay(String hang, String mau, String ten, int gia, int dungTich) {
        super(hang, mau, ten, gia);
        this.DungTich = dungTich;
    }

    public int getDungTich() {return DungTich;}
    public void setDungTich(int dungTich) {DungTich = dungTich;}


    @Override
    public String toString() {
        return super.toString() +
                "XeMay{" +
                "Ten :" + getTen() +
                "DungTich=" + DungTich +
                "Gia :" + getGia()+
                '}';
    }
}
