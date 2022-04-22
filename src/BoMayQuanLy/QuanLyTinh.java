package BoMayQuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTinh implements QuanLy<Tinh>{
    private final List<Tinh>tinhList  = new ArrayList<Tinh>();

    public QuanLyTinh(){
        QuanLyTinh quanLyTinh = new QuanLyTinh();
        quanLyTinh.them(new Tinh("HN",20.3,29));
        quanLyTinh.them(new Tinh("HANAM",22.0,90));
        quanLyTinh.them(new Tinh("TB",20.6,18));
        quanLyTinh.them(new Tinh("NB",21.2,35));
        quanLyTinh.them(new Tinh("VP",24.2,88));


    }


    @Override
    public void them(Tinh tinh) {
        this.tinhList.add(tinh);
    }

    @Override
    public void hienThi() {
        for(int i = 0 ; i < tinhList.size(); i ++){
            System.out.println(tinhList.get(i));
        }

    }

    @Override
    public int viTri(int maT) {
        for(int i = 0 ; i < tinhList.size() ; i ++){
            if(this.tinhList.get(i).getMaT()==maT){
                return i;
            }
        }

        return -1;
    }






}
