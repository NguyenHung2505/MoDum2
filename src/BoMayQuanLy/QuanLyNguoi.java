package BoMayQuanLy;

import CanBo.QuanLy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNguoi implements QuanLyCB<Nguoi> {
    List<Nguoi> nguoiList = new ArrayList<>();

    public QuanLyNguoi() {
        nguoiList.add(new Nguoi(1, "THUAN", 30, QuanLyTinh.tinhList.get(1)));
        nguoiList.add(new Nguoi(2, "NAM", 33, QuanLyTinh.tinhList.get(2)));
        nguoiList.add(new Nguoi(3, "MANH", 25, QuanLyTinh.tinhList.get(2)));
        nguoiList.add(new Nguoi(4, "HIEU", 22, QuanLyTinh.tinhList.get(4)));
        nguoiList.add(new Nguoi(5, "HOANG", 20, QuanLyTinh.tinhList.get(3)));
    }


    @Override
    public void them(Nguoi nguoi) {
        this.nguoiList.add(nguoi);

    }

    @Override
    public void hienThi() {
        for (Nguoi p : nguoiList) {
            System.out.println(p);
        }

    }

    @Override
    public int timKiem(int id) {
        for (int i = 0; i < nguoiList.size(); i++) {
            if (this.nguoiList.get(i).getId() == id) {
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

//    public void hienThiNguoiTheoid(int id){
//        for (Nguoi p: nguoiList){
//            if(p.getTinh().getId()==id){
//                System.out.println(p);
//            }
//        }
//    }

    public void hienThiNguoiTheoid(int id){
        for(int i = 0 ; i <nguoiList.size(); i ++){
            if(this.nguoiList.get(i).getTinh().getId()==id){
                System.out.println(nguoiList.get(i));
            }
        }
    }



    public static void main(String[] args) {
        QuanLyNguoi quanLyNguoi = new QuanLyNguoi();
        QuanLyTinh quanLyTinh = new QuanLyTinh();
        Scanner sc = new Scanner(System.in);
        Scanner sct = new Scanner(System.in);
        System.out.println("nhập thông tin người dùng");
        System.out.println("nhập mã : ");
        int id = sc.nextInt();
        System.out.println("nhập tên:");
        String name = sct.nextLine();
        System.out.println("nhập tuổi : ");
        int tuoi = sc.nextInt();
        System.out.println("chọn tỉnh (nhập mã):");
        quanLyTinh.hienThi();
        int idofTinh = sc.nextInt();
        quanLyNguoi.them(new Nguoi(id,name, tuoi, QuanLyTinh.tinhList.get(quanLyTinh.timKiem(idofTinh))));
//        quanLyNguoi.hienThi();

        quanLyNguoi.hienThiNguoiTheoid(36);


    }
}
