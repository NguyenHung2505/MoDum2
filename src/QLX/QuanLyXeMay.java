package QLX;

public class QuanLyXeMay implements QuanLy<XeMay> {
    public XeMay[] DanhSach = new XeMay[20];
    private int size = 0;

    @Override
    public void them(XeMay XeMay) {
        DanhSach[size]= XeMay;
        size++;
    }

    @Override
    public void sua(String Ten) {XeMay XeMay = new XeMay();
        DanhSach[timkiem(Ten)]=  XeMay;
    }

    @Override
    public void xoa(String Ten) {}

    @Override
    public int timkiem(String Ten) {
        for (int i =0; i < size ; i ++){
            if(Ten == DanhSach[i].getTen()){
                return i;
            };
        }
        return -1;
    };

    @Override
    public void SapXep() {

    }

    @Override
    public void print() {
        for (int i = 0 ; i<size ; i++){
            System.out.println(DanhSach[i]);
        }
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay("HonDa","Bleu","g63", 1000,50);
        XeMay xm2 = new XeMay("HonDa","Do","wwua", 100,50);
        XeMay xm3 = new XeMay("HonDa","Trang","lam", 10,50);
        XeMay xm4 = new XeMay("HonDa","Vang","nokia", 140,50);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.them(xm4);
        ql.print();
        System.out.println("vitrix" + ql.timkiem("nokia"));
    }
}
