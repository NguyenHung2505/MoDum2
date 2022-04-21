package PeoPle;

import danhSach.Student;

import java.util.ArrayList;

public class  Family {
    private ArrayList<PeoPle>danhSach;
    private String diachi;
    private int sothanhvien =0;

    public Family() {
        this.danhSach=new ArrayList<PeoPle>();
    }

    public Family( String diachi, int sothanhvien) {
//        this.danhSach = danhSach;

        this.diachi = diachi;
        this.sothanhvien = sothanhvien;
    }

    public ArrayList<PeoPle> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<PeoPle> danhSach) {
        this.danhSach = danhSach;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }


    public void add(PeoPle peoPle){
        this.danhSach.add(peoPle);
        sothanhvien++;

    }
    public void noihienthi(){
        for(int i =0 ; i<danhSach.size();i ++){
            System.out.println(danhSach.get(i));
        }
        System.out.println("dia chi " +diachi +"so thanh vien "+ sothanhvien);
        System.out.println("---------------");
    }

    public int timkiemm(String id){
        for (int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    public void xoa (String id){
        int indexOfhocsinh=timkiemm(id);
        if(indexOfhocsinh == -1){
        } else{
            danhSach.remove(indexOfhocsinh);
            sothanhvien--;
        }
    }

    public void suaa(String id,PeoPle peoPle){
        int indexOfhs=timkiemm(id);
        if(indexOfhs == -1){
            System.out.println("khong co");
        } else{
            danhSach.set(indexOfhs,peoPle);
        }
    }

    @Override
    public String toString() {
        return "Family{" +
                ", diachi='" + diachi + '\'' +
                ", sothanhvien='" + sothanhvien + '\'' +
                '}';
    }


}
