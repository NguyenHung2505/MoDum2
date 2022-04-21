package ConNguoi;

import QLX.XeMay;

import java.util.ArrayList;
import java.util.List;

public class Kazoku {
   private List<Hito>hitoList = new ArrayList<Hito>();
    private String diaChi;
    private int soThanhVien = 0;

    public Kazoku() {}

    public Kazoku(String diaChi) {
        this.diaChi = diaChi;
    }

    public Kazoku(List<Hito> hitoList, String diaChi, int soThanhVien) {
        this.hitoList = hitoList;
        this.diaChi = diaChi;
        this.soThanhVien = soThanhVien;
    }

    public List<Hito> getHitoList() {
        return hitoList;
    }

    public void setHitoList(List<Hito> hitoList) {
        this.hitoList = hitoList;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    @Override
    public String toString() {
        return "Kazoku{" +
                "hitoList=" + hitoList +
                ", diaChi='" + diaChi + '\'' +
                ", soThanhVien=" + soThanhVien +
                '}';
    }


    public int viTri (String ten){
        for (int i = 0; i < hitoList.size(); i++) {
            if(this.hitoList.get(i).getTen() == ten){
                return i;
            }
        }
        return -1;
    }

    public void hienThi(){
        for (int i = 0; i < hitoList.size(); i++) {
            System.out.println(hitoList.get(i));


        }
        System.out.println("dia chi "+ diaChi +"so thanh vien " + soThanhVien);
    }

    public void add(Hito hito) {
        this.hitoList.add(hito);
        soThanhVien ++;
    }

    public void xoaa(String ten){
        if (viTri(ten) != -1){
            this.hitoList.remove(viTri(ten));
            this.soThanhVien--;
        }
    }

    public void suaa(String ten, Hito hito) {
        if (viTri(ten) != -1) {
            this.hitoList.set(viTri(ten), hito);
        }
        else {
            System.out.println(" không có trong list");
        }
    }




}