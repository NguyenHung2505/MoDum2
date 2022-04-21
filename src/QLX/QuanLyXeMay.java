package QLX;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    public XeMay[] DanhSach = new XeMay[4];
    public XeMay[] DanhSachXoa ;

    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        DanhSach[size]= xeMay;
        size++;
    }


    @Override
    public void sua(String Ten, XeMay xeMay) {
        DanhSach[timkiem(Ten)] =  xeMay;
    }

    @Override
    public void xoa(String Ten) {
        DanhSachXoa = new XeMay[size-1];
        int viTri = timkiem(Ten);
        if (viTri != -1 ){
            for (int i = 0; i < DanhSachXoa.length; i++) {
                DanhSachXoa[i]= DanhSach[i];
            }
            for (int i = viTri ; i < size - 1; i++){
                DanhSachXoa[i] = DanhSach[i + 1];
            }
        } else {
            System.out.println("Khong tim thay!");
        }

    }

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
        Arrays.sort(DanhSach);
    }

    @Override
    public void print() {
        for (int i = 0 ; i<size ; i++){
            System.out.println(DanhSach[i]);
        }
    }
    public void print2() {
        for (int i = 0 ; i<DanhSachXoa.length ; i++){
            System.out.println(DanhSachXoa[i]);
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
        XeMay xm5 = new XeMay("HonDa","hong","lucaku", 110,150);
        System.out.println("vitrix" + ql.timkiem("nokia"));
        ql.sua("lam", xm5);
        ql.print();
        System.out.println("----Sau khi sap xep-----" );
        ql.SapXep();
        ql.print();
        System.out.println("-----sau khi xoa-----");
        ql.xoa("wwua");
        ql.print2();

    }
}
