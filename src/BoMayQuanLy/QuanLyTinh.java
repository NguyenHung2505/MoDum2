package BoMayQuanLy;

import CanBo.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTinh implements QuanLyCB<Tinh> {
    public static List<Tinh>tinhList = new ArrayList<>();

    static {
        tinhList.add(new Tinh(36,"TH",3000,2500));
        tinhList.add(new Tinh(35,"NB",2500,2000));
        tinhList.add(new Tinh(30,"HN",3300,2300));
        tinhList.add(new Tinh(18,"ND",2900,2700));
        tinhList.add(new Tinh(34,"HD",3500,2100));
    }

    @Override
    public void them(Tinh tinh) {
        this.tinhList.add(tinh);

    }

    @Override
    public void hienThi() {
        for(Tinh p : tinhList){
            System.out.println(p);
        }

    }

    @Override
    public int timKiem(int id) {
        for (int i = 0; i < tinhList.size(); i++) {
            if(tinhList.get(i).getId() == id){
                return i;
            }
        }
        return -1;

    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa() {

    }
}
